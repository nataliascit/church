import './app.home.module';

/**
 * @desc This Controller is responsible for handling the view 'homeView.html'
 * @author William Custodio
 */
(function () {
    'use strict';

    const homeModule = angular.module('paymentManagement.home');

    function HomeController(){}

    homeModule.controller('homeController', [HomeController]);
}());