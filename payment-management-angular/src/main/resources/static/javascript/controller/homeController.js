/**
 * @desc This Controller is responsible for handling the view 'index.html'
 * @author wcustodio
 * @required churchRestService
 */
(function(){
    'use strict';

    var paymentManagementApp = angular.module('paymentManagement');

    paymentManagementApp.$inject = ['churchRestService'];

    paymentManagementApp.controller('homeController', function (churchRestService) {

        var vm = this;

        vm.saveChurch = function() {

            churchRestService.findAll({'id': 2},function() {
                console.log("success");
            },function() {
                console.log("error");
            });
        }
    });
})();