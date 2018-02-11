import './app.contribution.module';
import './contributionRestService';

/**
 * @desc This Controller is responsible for handling the view 'contributionView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var contributionModule = angular.module('paymentManagement.contribution');

    function ContributionController(){}

    contributionModule.controller('contributionController', [ContributionController]);
}());