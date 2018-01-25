/**
 * @desc this class will hold functions used to execute HTTP requests to retrieve or manage the content of a Church.
 * @author wcustodio
 * @required $resource
 */
(function(){
    'use strict';

    var paymentManagementApp = angular.module('paymentManagement');

    paymentManagementApp.$inject = ['$resource'];

    paymentManagementApp.service('churchRestService', function ($resource) {

        return $resource('http://localhost:8081/payment-management/api/churches/:id', null, {
            'create': {
                method:'POST'
            },
            'update': {
                method:'PUT'
            },
            'delete': {
                method:'DELETE'
            },
            'find': {
                method:'GET'
            },
            'findAll': {
                method:'GET'
            }
        });
    });
})();