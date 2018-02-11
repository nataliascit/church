import '../app.menu.module';
import '../../../shared/environment/authentication/authenticationRestService';

/**
 * @desc This Controller is responsible for handling the view 'mainMenuView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var paymentManagementModule = angular.module('paymentManagement.menus');

    function MainMenuController($window, environmentConfig, authenticationRestService) {

        var vm = this;

        vm.logoutOnClick = function() {
            authenticationRestService.logout(function() {
                // Redirects to the login page after successfully logout.
                $window.location.href = environmentConfig.loginPageUrl;
            });
        }
    }

    paymentManagementModule.controller('mainMenuController', [ '$window', 'environmentConfig', 'authenticationRestService', MainMenuController]);
}());