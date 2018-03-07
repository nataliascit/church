import '../app.contributor.module';
import '../service/contributorRestService';

/**
 * @desc This Controller is responsible for handling the view 'contributorCatalogView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var contributorModule = angular.module('paymentManagement.contributor');

    function ContributorCatalogController(contributionRestService){

        var vm = this;

        /**
         * List of all the existing contributors.
         * @type {Array}
         */
        vm.contributors = [];

        /**
         * Function responsible for handling the hook for the initialization of the controller.
         */
        vm.onInit = function() {
            contributionRestService.findAll(function(response) {
                vm.contributors = response.data;
            });
        }
    }
    contributorModule.controller('contributorCatalogController', ['contributionRestService', ContributorCatalogController]);
}());