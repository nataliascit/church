import '../app.menu.module';
import './mainMenuController';

/**
 * @desc This Controller is responsible for handling the view 'mainMenuView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var paymentManagementModule = angular.module('paymentManagement.menus');

    paymentManagementModule.component('mainMenu', {
        restrict: 'E',
        controller: 'mainMenuController as vm',
        templateUrl: 'app/components/menus/mainMenu/mainMenuView.html'
    });
}());