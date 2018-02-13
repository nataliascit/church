/**
 * @desc This Controller is responsible for handling the view 'messageView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var paymentManagementModule = angular.module('paymentManagement');

    function MainMenuController(messageService) {

        var vm = this;

        vm.messages = [];

        /**
         * Map the message's type into a specific css class.
         * @param type The type of the message. Ex: INFO, WARN or ERROR.
         * @return Returns the message class according to the message type.
         */
        vm.getClassByMessageType = function(type) {
           return messageService.getClassByMessageType(type);
        };

        /**
         * Verifies if the message will be shown to the user or not.
         * @returns {boolean} <code>true</code>: if the message will be shown. </br>
         *                    <code>false</code>: if the message will not be shown.
         */
        vm.showMessages = function() {
            // Refresh the messages according to the messages that are provided by the messages service.
            vm.messages = messageService.getMessages();
            return vm.messages.length > 0;
        };
    }

    paymentManagementModule.controller('mainMenuController', ['messageService', MainMenuController]);
}());