import '@uirouter/angularjs';
import 'angular-resource';
import '../../shared/environment/config/app.environment.constant';
import '../../shared/environment/app.environment.module';

/**
 * @desc Configures the contribution module.
 * @author wcustodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.contribution', ['ui.router', 'ngResource', 'paymentManagement.environment']);
}());