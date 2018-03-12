import '@uirouter/angularjs';
import 'angular-resource';
import '../../shared/environment/config/app.environment.constant';
import '../../shared/environment/app.environment.module';
import '../breadcrumb/app.breadcrumb.module';

/**
 * @desc Configures the contributor module.
 * @author wcustodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.contributor', ['ui.router', 'ngResource', 'paymentManagement.breadcrumb', 'paymentManagement.environment']);
}());