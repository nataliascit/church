import '@uirouter/angularjs';
import 'angular-resource';
import '../../shared/environment/config/app.environment.constant';
import '../../shared/environment/app.environment.module';

/**
 * @desc Configures the existing application's modules.
 *    @authour wcustodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.church', ['ui.router', 'ngResource', 'paymentManagement.environment']);
}());