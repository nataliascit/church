(function(){
    'use strict';

    angular.module('paymentManagement').config(function ($stateProvider) {

        $stateProvider
            .state('application', {
                url: '/',
                templateUrl: 'index.html',
                controller: 'homeController as vm'
            });
    });
})();