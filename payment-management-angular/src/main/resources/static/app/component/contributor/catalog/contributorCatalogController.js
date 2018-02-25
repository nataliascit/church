import '../app.contributor.module';
import '../service/contributorRestService';

/**
 * @desc This Controller is responsible for handling the view 'contributorCatalogView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var contributorModule = angular.module('paymentManagement.contributor');

    function ContributorCatalogController(){}

    contributorModule.controller('contributorCatalogController', [ContributorCatalogController]);
}());