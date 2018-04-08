import '../app.contribution.module';
import '../service/contributionRestService';
import '../../campaign/service/campaignRestService';
import '../../contributor/service/contributorRestService';

/**
 * @desc This Controller is responsible for handling the view 'contributionRegisterView.html'
 * @author William Custodio
 */
(function () {
    'use strict';

    const module = angular.module('paymentManagement.contribution');

    function ContributionRegisterController($scope, $state, $stateParams, messageService, formValidatorService,
                                            campaignRestService, contributorRestService,
                                            contributionRestService, springIntegrationService,
                                            CONTRIBUTION_LINK_PROPERTY_MAPPER) {
        const vm = this;

        /**
         * List of all the existing campaigns.
         * @type {Array}
         */
        vm.campaigns = [];

        /**
         * List of all the existing contributors.
         * @type {Array}
         */
        vm.contributors = [];

        /**
         * The contribution to be edited/created.
         * @type {{Object}}
         */
        vm.contribution = {
            id: null,
            campaign: null,
            contributor: null,
            creationDate: new Date(),
            amount: 0
        };

        /**
         * Function responsible for handling the hook for the initialization of the controller.
         */
        vm.onInit = function() {
            if($stateParams.idContribution) {
                _loadContributionById($stateParams.idContribution);
            }
            _findAllCampaign();
            _findAllContributor();
        };

        /**
         * Handle the on click action for the save button of a contribution.
         */
        vm.saveContributionOnClick = function() {

            var contribution = angular.copy(vm.contribution);

            // Convert all the data before persisting into the database.
            _convertDataBeforePersist(contribution);

            if(_isUpdateAction()) {
                contributionRestService.update(contribution.id, contribution, function() {
                    messageService.showSuccessMessage('application.contribution.register.message.successUpdate');
                    $state.go('^', {}, { reload: true }); // redirect to the catalog page.
                });
            } else if(_isCreateAction()) {
                contributionRestService.create(contribution, function() {
                    messageService.showSuccessMessage('application.contribution.register.message.successCreation');
                    $state.go('^', {}, { reload: true }); // redirect to the catalog page.
                });
            }
        };

        /**
         * Verifies if a certain field of the form contains error or not.
         * @param field The field name to be validated.
         * @param validation The type of the validation to be performed.
         * @returns {boolean}
         */
        vm.hasError = function(field, validation) {
            return formValidatorService.hasError($scope.contributionRegisterForm, field, validation);
        };

        /**
         * Verifies if the amount has errors of validation.
         * @returns {boolean}
         */
        vm.amountFieldHasError = function() {
            return $scope.contributionRegisterForm.$submitted && vm.contribution.amount === 0;
        };

        /**
         * Load a certain contribution by their identifier.
         * @param {Number} contributionId
         * @private
         */
        function _loadContributionById(contributionId) {
            contributionRestService.find(contributionId, function(response) {
                // Retrieve only the data from the links: 'campaign' and 'contributor'.
                springIntegrationService.retrieveDataFromItemLinks(response, ['campaign', 'contributor'])
                    .then(function() {
                        vm.contribution = response;
                        // Converts the amount to cents.
                        vm.contribution.amount = vm.contribution.amount/100;
                    });
            });
        }

        /**
         * Search for all existing campaigns in the database.
         * @private
         */
        function _findAllCampaign() {
            campaignRestService.findAll(null, function(response) {
                vm.campaigns = response._embeddedItems;
            });
        }

        /**
         * Search for all existing contributors in the database.
         * @private
         */
        function _findAllContributor() {
            contributorRestService.findAll(null, function(response) {
                vm.contributors = response._embeddedItems;
            });
        }

        /**
         * Convert all the data before persisting into the database.
         * @param contribution The contribution to be persisted.
         * @private
         */
        function _convertDataBeforePersist(contribution) {
            // Converts the amount to cents.
            contribution.amount = contribution.amount*100;
            // Convert all the properties before performing the action.
            springIntegrationService.convertProperty(contribution, CONTRIBUTION_LINK_PROPERTY_MAPPER);
        }

        /**
         * Verifies if the action is an update.
         * @returns {Boolean}
         * @private
         */
        function _isUpdateAction() {
            return $stateParams.idContribution || vm.contribution.id;
        }

        /**
         * Verifies if the action is an create.
         * @returns {boolean}
         * @private
         */
        function _isCreateAction() {
            return !$stateParams.idContribution && !vm.contribution.id;
        }
    }
    module.controller('contributionRegisterController', [
        '$scope',
        '$state',
        '$stateParams',
        'messageService',
        'formValidatorService',
        'campaignRestService',
        'contributorRestService',
        'contributionRestService',
        'springIntegrationService',
        'CONTRIBUTION_LINK_PROPERTY_MAPPER',
        ContributionRegisterController
    ]);
}());
