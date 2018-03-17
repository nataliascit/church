import './app.message.module';
import './messageService';

/**
 * @desc This Controller is responsible for handling the view 'messageView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    function MessageConfig($httpProvider) {

        function MessageInterceptor($q, messageService) {
            return {
                'requestError': function(response) {
                    messageService.cleanMessages();
                    messageService.mapMessagesFromResponse(response);
                },
                'responseError': function(response) {
                    messageService.cleanMessages();
                    messageService.mapMessagesFromResponse(response);
                }
            };
        }
        $httpProvider.interceptors.push(['$q', 'messageService', MessageInterceptor]);
    }

    angular.module('paymentManagement.message').config(['$httpProvider', MessageConfig]);
}());