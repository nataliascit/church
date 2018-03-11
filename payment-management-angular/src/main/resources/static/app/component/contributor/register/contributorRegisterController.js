import '../app.contributor.module';
import '../service/contributorRestService';
import '../config/app.contributor.constant';
import '../../../shared/message/messageService';

/**
 * @desc This Controller is responsible for handling the view 'contributorRegisterView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    const registerContributorModule = angular.module('paymentManagement.contributor');

    function ContributorRegisterController($stateParams, messageService, contributorRestService, contributionRestService, GENDER_CATALOG, CIVIL_STATE) {

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
        vm.civilStates = CIVIL_STATE;

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
            contributorRestService.create(vm.contributor, function() {
                messageService.showSuccessMessage('application.contributor.register.message.successCreation');
            });
        };

        /**
         * Handle the on click action for the delete button of a contribution associated to a contributor.
         */
        vm.deleteContributionOnClick = function() {
            contributorRestService.remove(vm.contributor.id, function() {
                messageService.showSuccessMessage('application.contributor.register.message.successContributionDeletion');
            });
        };

        /**
         * Load a certain contributor by their identifier.
         * @param {Number} contributorId
         * @private
         */
        function _loadContributorById(contributorId) {
            return contributorRestService.find(contributorId, function(response) {
                vm.contributor = response;
            }).$promise;
        }
    }
    registerContributorModule.controller('contributorRegisterController', ['$stateParams', 'messageService', 'contributorRestService',
        'contributionRestService', 'GENDER_CATALOG', 'CIVIL_STATE', ContributorRegisterController]);
}());
