import '../app.contribution.module';
import '../service/contributionRestService';

/**
 * @desc This Controller is responsible for handling the view 'contributionCatalogView.html'
 * @author William Custodio
 */
(function () {
    'use strict';

    var contributionModule = angular.module('paymentManagement.contribution');

    function ContributionCatalogController(){}

    contributionModule.controller('contributionCatalogController', [ContributionCatalogController]);
}());