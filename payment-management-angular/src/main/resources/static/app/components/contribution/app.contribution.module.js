import 'angular-resource';

import '../../shared/environment/app.environment.variables';
import '../../shared/environment/app.environment.module';

/**
 * @desc Configures the contribution module.
 * @author wcustodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.contribution', ['ngResource', 'paymentManagement.environment']);
}());