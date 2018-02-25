import '../app.contributor.module';
import '../service/contributorRestService';

/**
 * @desc This Controller is responsible for handling the view 'contributorRegisterView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var registerContributorModule = angular.module('paymentManagement.contributor');

    function ContributorRegisterController(){}

    registerContributorModule.controller('contributorRegisterController', [ContributorRegisterController]);
}());
