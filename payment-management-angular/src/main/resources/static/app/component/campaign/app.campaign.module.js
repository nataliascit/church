import 'angular-resource';
import '../../shared/environment/config/app.environment.variables';
import '../../shared/environment/app.environment.module';

/**
 * @desc Configures the campaign module.
 *    @author wcustodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.campaign', ['ngResource', 'paymentManagement.environment']);
}());