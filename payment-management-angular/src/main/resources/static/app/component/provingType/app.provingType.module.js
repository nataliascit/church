import 'angular-resource';
import '../../shared/environment/config/app.environment.variables';
import '../../shared/environment/app.environment.module';

/**
 * @desc Configures the proving type module.
 * @author wcustodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.provingType', ['ngResource', 'paymentManagement.environment']);
}());