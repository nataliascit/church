import 'angular-resource';

import '../../shared/environment/config/app.environment.variables';
import '../../shared/environment/app.environment.module';

/**
 * @desc Configures the existing application's modules.
 *    @authour wcustodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.church', ['ngResource', 'paymentManagement.environment']);
}());