(function(){
    'use strict';

    angular.module('paymentManagement').config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise('/');

        $stateProvider
            .state('application', {
                url: '/',
                templateUrl: 'view/home.html',
                controller: 'homeController as vm'
            });
    });
})();