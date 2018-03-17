import '@uirouter/angularjs';
import '../../shared/environment/app.environment.module';
import '../../shared/environment/config/app.environment.constant';
import '../breadcrumb/app.breadcrumb.module';

/**
 * @desc Configures the home module.
 * @author wcustodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.home', [
        'ui.router',
        'paymentManagement.breadcrumb'
    ]);
}());