import '../app.contributor.module';
import '../service/contributorRestService';
import '../../contribution/service/contributionRestService';

/**
 * @desc This Controller is responsible for handling the view 'contributorCatalogView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    const contributorModule = angular.module('paymentManagement.contributor');

    function ContributorCatalogController(messageService, contributorRestService) {

        const vm = this;

        /**
         * List of all the existing contributors.
         * @type {Array}
         */
        vm.contributors = [];

        /**
         * Represents the object containing the contributor to be deleted.
         * @type {{id: null, index: null}}
         */
        var _contributorToDelete = {
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
         * Handle the on click action for the delete button of a contributor.
         */
        vm.deleteContributorOnClick = function() {
            contributorRestService.remove(_contributorToDelete.id, function() {
                vm.contributors.splice(_contributorToDelete.index,1); // Remove the element from the array.
                messageService.showSuccessMessage('application.contributor.register.message.successDeletion');
            });
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
         * Search for all existing contributors in the database.
         * @private
         */
        function _findAllContributor() {
            contributorRestService.findAll(function(response) {
                vm.contributors = response._embedded.contributors;
            });
        }
    }
    contributorModule.controller('contributorCatalogController', ['messageService', 'contributorRestService', ContributorCatalogController]);
}());