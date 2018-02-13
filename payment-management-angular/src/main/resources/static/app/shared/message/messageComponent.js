/**
 * @desc This is the definition of a component responsible for handling the messages to be shown for the user.
 * @author wcustodio
 */
(function () {
    'use strict';

    var paymentManagementModule = angular.module('paymentManagement');

    paymentManagementModule.component('message', {
        restrict: 'E',
        controller: 'messageController as vm',
        templateUrl: 'app/shared/message/messageView.html'
    });
}());