/**
 * @desc This service is responsible for performing actions over the messages to be shown to a user.
 * @author wcustodio
 */
(function () {
    'use strict';

    var paymentManagementModule = angular.module('paymentManagement');

    function MessageService(CSS_CLASS_CATALOG, TIMEOUT_CATALOG) {

        /**
         * The template of a possible message.
         * @type {{key: null, message: null, type: string, timeout: *}}
         */
        var _message = {
            key: null,
            message: null,
            type: 'DEFAULT',
            timeout: TIMEOUT_CATALOG['DEFAULT']
        };

        var _messages = [];

        /**
         * Add a specific message to the array of messages.
         * @param message {Object} The JSON that represents the message to be added. Ex: {key: null, type: null}.
         * @private
         */
        function _addMessage(message){
            _messages.push(message);
        }

        /**
         * Clean all the messages from the array of messages.
         * @private
         */
        function _cleanMessages() {
            _messages = [];
        }

        /**
         * Map the message's type into a specific css class.
         * @param type The type of the message. Ex: INFO, WARN or ERROR.
         */
        function _getClassByType(type) {
            return type ? CSS_CLASS_CATALOG[type] : CSS_CLASS_CATALOG['DEFAULT'];
        }

        /**
         * Get a copy of the existing messages array.
         * @returns {*} The copy with all messages in the array.
         * @private
         */
        function _getMessages() {
            return angular.copy(_messages);
        }

        /**
         * Get a copy of the template.
         * @returns {*} The copy of the template of message.
         * @private
         */
        function _getMessageTemplate() {
            return angular.copy(_message);
        }

        /**
         * Map all the messages that where provided by the response.
         * @param response The object that represents the response.
         * @private
         */
        function _mapMessagesFromResponse(response) {
            if(response.data.message) {

            }
        }

        return {
            addMessage: _addMessage,
            cleanMessages: _cleanMessages,
            getClassByType: _getClassByType,
            getMessages: _getMessages,
            getMessageTemplate: _getMessageTemplate,
            mapMessagesFromResponse: _mapMessagesFromResponse
        };
    }

    paymentManagementModule.service('messageService', ['CSS_CLASS_CATALOG', 'TIMEOUT_CATALOG', MessageService]);
}());