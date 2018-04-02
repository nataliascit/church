import '../app.contribution.module';
import '../service/contributionRestService';
import '../../modal/confirmationModal/confirmationModalService';

/**
 * @desc This Controller is responsible for handling the view 'contributionCatalogView.html'
 * @author William Custodio
 */
(function () {
    'use strict';

    const module = angular.module('paymentManagement.contribution');

    function ContributionCatalogController(confirmationModalService, messageService,
                                           contributionRestService, springIntegrationService) {
        const vm = this;

        /**
         * List of all the existing contributions.
         * @type {Array}
         */
        vm.contributions = [];

        /**
         * Criteria used to filter all the existing contributions.
         * @type {{campaignName: null, contributorName: null, creationDate:null}}
         */
        vm.filter = {
            campaignName: null,
            contributorName: null,
            creationDate: null
        };

        /**
         * Represents the object containing the contribution to be deleted.
         * @type {{id: null, index: null}}
         */
        const _contributionToDelete = {
            id: null,
            index: null
        };

        /**
         * Function responsible for handling the hook for the initialization of the controller.
         */
        vm.onInit = function() {
            _findAllContribution();
        };

        /**
         * Defines the information used to delete a certain contribution.
         * @param contributionId The contribution identifier.
         * @param index The index where the contribution is located at the contributions array.
         */
        vm.setContributionToDelete = function(contributionId, index) {
            _contributionToDelete.id = contributionId;
            _contributionToDelete.index = index;
        };

        /**
         * Open the confirmation modal used to delete a contribution.
         */
        vm.openDeleteConfirmationModal = function() {
            confirmationModalService.open({
                title: 'application.contribution.catalog.modal.contributionDeletion.title',
                body: 'application.contribution.catalog.modal.contributionDeletion.body',
                confirmationOnClick: _deleteContribution
            });
        };

        /**
         * Search for all existing contributions in the database.
         * @private
         */
        function _findAllContribution() {
            contributionRestService.findAll(function(response) {
                springIntegrationService.retrieveDataFromItemsLinks(response._embeddedItems, ['campaign', 'contributor'])
                    .then(function() {
                        vm.contributions = response._embeddedItems;
                    });
            });
        }

        /**
         * Delete a certain contribution by their identifier.
         */
        function _deleteContribution() {
            contributionRestService.remove(_contributionToDelete.id, function() {
                vm.contributions.splice(_contributionToDelete.index,1); // Remove the element from the array.
                messageService.showSuccessMessage('application.contribution.catalog.message.successDeletion');
            });
        }
    }
    module.controller('contributionCatalogController', [
        'confirmationModalService',
        'messageService',
        'contributionRestService',
        'springIntegrationService',
        ContributionCatalogController
    ]);
}());