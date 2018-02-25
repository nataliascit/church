import '../app.menu.module';
import '../../../shared/environment/authentication/authenticationRestService';

/**
 * @desc This Controller is responsible for handling the view 'navigationMenuView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var paymentManagementModule = angular.module('paymentManagement.menu');

    function NavigationMenuController($window, environmentConfig, authenticationRestService) {

        var vm = this;

        vm.logoutOnClick = function() {
            authenticationRestService.logout(function() {
                // Redirects to the login page after successfully logout.
                $window.location.href = environmentConfig.loginPageUrl;
            });
        }
    }

    paymentManagementModule.controller('navigationMenuController', [ '$window', 'environmentConfig', 'authenticationRestService', NavigationMenuController]);
}());