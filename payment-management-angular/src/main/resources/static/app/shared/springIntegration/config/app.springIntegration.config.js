import '../app.springIntegration.module';

/**
 * @desc Configures the module responsible for holding the spring integration configuration.
 * @author William Custodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.springIntegration').config(function (SpringDataRestInterceptorProvider) {
        SpringDataRestInterceptorProvider.apply();
    });
}());