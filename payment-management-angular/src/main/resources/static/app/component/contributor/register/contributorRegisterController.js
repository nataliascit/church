import '../app.contributor.module';
import '../service/contributorRestService';
import '../config/app.contributor.constant';
import '../../../shared/message/messageService';
import '../../../shared/form/validator/formValidatorService';
import 'lodash';

/**
 * @desc This Controller is responsible for handling the view 'contributorRegisterView.html'
 * @author William Custodio
 */
(function () {
    'use strict';

    const registerContributorModule = angular.module('paymentManagement.contributor');

    function ContributorRegisterController($scope, $state, $stateParams, messageService, formValidatorService, contributorRestService,
                                           contributionRestService, GENDER_CATALOG, CIVIL_STATE_CATALOG) {
        const vm = this;

        /**
         * List of all the existing contributions.
         * @type {Array}
         */
        vm.contributions = [];

        /**
         * The contributor to be edited/created.
         * @type {{Object}}
         */
        vm.contributor = {
            id: null,
            name: null,
            fiscalNumber: null,
            gender: null,
            civilState: null,
            address: null,
            birthDate: new Date(),
            marriageDate: new Date(),
            partnerName: null,
            telephone: null,
            cellphone: null,
            contributions: [],
            beads: []
        };

        /**
         * Catalog with all existing genders for a contributor.
         */
        vm.genders = GENDER_CATALOG;

        /**
         * Catalog with all existing civil states.
         */
        vm.civilStates = CIVIL_STATE_CATALOG;

        /**
         * Function responsible for handling the hook for the initialization of the controller.
         */
        vm.onInit = function() {
            if($stateParams.id) {
                _loadContributorById($stateParams.id);
            }
        };

        /**
         * Handle the on click action for the save button of a contributor.
         */
        vm.saveContributorOnClick = function() {
            if(_isUpdateAction()) {
                contributorRestService.update(vm.contributor.id, vm.contributor, function() {
                    messageService.showSuccessMessage('application.contributor.register.message.successUpdate');
                    $state.go('^', {}, { reload: true }); // redirect to the catalog page.
                });
            } else if(_isCreateAction()) {
                contributorRestService.create(vm.contributor, function() {
                    messageService.showSuccessMessage('application.contributor.register.message.successCreation');
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
        vm.hasError = function(field, validation){
            return formValidatorService.hasError($scope.contributorRegisterForm, field, validation);
        };

        /**
         * Verifies if the gender has errors of validation.
         * @returns {boolean}
         */
        vm.genderFieldHasError = function() {
            return ($scope.contributorRegisterForm.$submitted && _.isEmpty(vm.contributor.gender));
        };

        /**
         * Load a certain contributor by their identifier.
         * @param {Number} contributorId
         * @private
         */
        function _loadContributorById(contributorId) {
            contributorRestService.find(contributorId, function(response) {
                vm.contributor = response;
            });
        }

        /**
         * Verifies if the action is an update.
         * @returns {Boolean}
         * @private
         */
        function _isUpdateAction() {
            return $stateParams.id || vm.contributor.id;
        }

        /**
         * Verifies if the action is an create.
         * @returns {boolean}
         * @private
         */
        function _isCreateAction() {
            return !$stateParams.id && !vm.contributor.id;
        }
    }
    registerContributorModule.controller('contributorRegisterController', [
        '$scope',
        '$state',
        '$stateParams',
        'messageService',
        'formValidatorService',
        'contributorRestService',
        'contributionRestService',
        'GENDER_CATALOG',
        'CIVIL_STATE_CATALOG',
        ContributorRegisterController
    ]);
}());
