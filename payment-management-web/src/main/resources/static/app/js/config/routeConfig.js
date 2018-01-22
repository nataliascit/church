(function(){
    "use strict";

    angular.module("paymentManagement").config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise('/home');

        $stateProvider.state('home', {
            url: '/home',
            templateUrl: 'index.html'
        });
    });
})();