import './app.home.module';

/**
 * @desc This Controller is responsible for handling the view 'homeView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var homeModule = angular.module('paymentManagement.home');

    function HomeController(){}

    homeModule.controller('homeController', [HomeController]);
}());