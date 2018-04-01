import '../app.contributor.module';
import '../service/contributorRestService';
import '../../contribution/service/contributionRestService';
import '../../modal/confirmationModal/confirmationModalService';

/**
 * @desc This Controller is responsible for handling the view 'contributorCatalogView.html'
 * @author William Custodio
 */
(function () {
    'use strict';

    const contributorModule = angular.module('paymentManagement.contributor');

    function ContributorCatalogController(confirmationModalService, messageService, contributorRestService) {

        const vm = this;

        /**
         * List of all the existing contributors.
         * @type {Array}
         */
        vm.contributors = [];

        /**
         * Criteria used to filter all the existing contributors.
         * @type {{name: null}}
         */
        vm.filter = {
            name: null
        };

        /**
         * Represents the object containing the contributor to be deleted.
         * @type {{id: null, index: null}}
         */
        const _contributorToDelete = {
          id: null,
          index: null
        };

        /**
         * Function responsible for handling the hook for the initialization of the controller.
         */
        vm.onInit = function() {
            _findAllContributor();
        };

        /**
         * Defines the information used to delete a certain contributor.
         * @param contributorId The contributor identifier.
         * @param index The index where the contributor is located at the contributors array.
         */
        vm.setContributorToDelete = function(contributorId, index) {
            _contributorToDelete.id = contributorId;
            _contributorToDelete.index = index;
        };

        /**
         * Open the confirmation modal used to delete a contributor.
         */
        vm.openDeleteConfirmationModal = function() {
            confirmationModalService.open({
                title: 'application.contributor.catalog.modal.contributorDeletion.title',
                body: 'application.contributor.catalog.modal.contributorDeletion.body',
                confirmationOnClick: _deleteContributor
            });
        };

        /**
         * Search for all existing contributors in the database.
         * @private
         */
        function _findAllContributor() {
            contributorRestService.findAll(function(response) {
                vm.contributors = response._embeddedItems;
            });
        }

        /**
         * Delete a certain contributor by their identifier.
         */
        function _deleteContributor() {
            contributorRestService.remove(_contributorToDelete.id, function() {
                vm.contributors.splice(_contributorToDelete.index,1); // Remove the element from the array.
                messageService.showSuccessMessage('application.contributor.register.message.successDeletion');
            });
        }
    }
    contributorModule.controller('contributorCatalogController', [
        'confirmationModalService',
        'messageService',
        'contributorRestService',
        ContributorCatalogController
    ]);
}());