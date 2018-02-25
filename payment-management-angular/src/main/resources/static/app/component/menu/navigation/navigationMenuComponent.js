import '../app.menu.module';
import './navigationMenuController';

/**
 * @desc This Controller is responsible for handling the view 'navigationMenuView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var paymentManagementModule = angular.module('paymentManagement.menu');

    paymentManagementModule.component('navigationMenu', {
        restrict: 'E',
        controller: 'navigationMenuController as vm',
        templateUrl: 'app/component/menu/navigation/navigationMenuView.html'
    });
}());