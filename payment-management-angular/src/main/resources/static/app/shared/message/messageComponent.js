/**
 * @desc This is the definition of a component responsible for handling the messages to be shown for the user.
 * @author wcustodio
 */
(function () {
    'use strict';

    var module = angular.module('paymentManagement.message');

    module.component('message', {
        restrict: 'E',
        controller: 'messageController as vm',
        templateUrl: 'app/shared/message/messageView.html'
    });
}());