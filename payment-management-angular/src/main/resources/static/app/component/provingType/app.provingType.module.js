import '@uirouter/angularjs';
import 'angular-resource';
import '../../shared/environment/config/app.environment.constant';
import '../../shared/environment/app.environment.module';
import '../breadcrumb/app.breadcrumb.module';

/**
 * @desc Configures the proving type module.
 * @author wcustodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.provingType', ['ui.router', 'ngResource', 'paymentManagement.breadcrumb', 'paymentManagement.environment']);
}());