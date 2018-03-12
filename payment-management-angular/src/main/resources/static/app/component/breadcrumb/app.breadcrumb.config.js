import './app.breadcrumb.module';

/**
 * @desc Configures the breadcrumb used to navigate over the application.
 * @param breadcrumbconfigProvider The responsible for defining the breadcrumb component configuration.
 * @author wcustodio
 */
(function () {
    'use strict';

    var module = angular.module('paymentManagement.breadcrumb');

    module.config(['breadcrumbconfigProvider', function (breadcrumbconfigProvider) {

        // Do not show the abstracts states on the breadcrumb.
        breadcrumbconfigProvider.setAbstract(false);
    }]);
})();