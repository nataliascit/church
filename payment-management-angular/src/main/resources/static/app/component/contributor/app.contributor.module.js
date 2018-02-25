import 'angular-resource';
import '../../shared/environment/config/app.environment.variables';
import '../../shared/environment/app.environment.module';

/**
 * @desc Configures the contributor module.
 * @author wcustodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.contributor', ['ngResource', 'paymentManagement.environment']);
}());