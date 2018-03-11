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
         * Function responsible for handling the hook for the initialization of the controller.
         */
        vm.onInit = function() {
            _findAllContributor();
        };

        /**
         * Handle the on click action for the delete button of a contributor.
         * @param contributorId {Number} The contributor's identifier.
         * @param index {Number} The row number where the contributor is located.
         */
        vm.deleteContributorOnClick = function(contributorId, index) {
            contributorRestService.remove(contributorId, function() {
                vm.contributors.splice(index,1); // Remove the element from the array.
                messageService.showSuccessMessage('application.contributor.register.message.successDeletion');
            });
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