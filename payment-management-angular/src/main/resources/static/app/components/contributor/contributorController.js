import './app.contributor.module';
import './contributorRestService';

/**
 * @desc This Controller is responsible for handling the view 'contributorView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var contributorModule = angular.module('paymentManagement.contributor');

    function ContributorController(){}

    contributorModule.controller('contributorController', [ContributorController]);
}());