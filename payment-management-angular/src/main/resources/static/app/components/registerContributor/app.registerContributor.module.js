import 'angular-resource';

import '../../shared/environment/app.environment.variables';
import '../../shared/environment/app.environment.module';

/**
 * @desc Configures the registerContributor module.
 *    @author wcustodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.registerContributor', ['ngResource', 'paymentManagement.environment']);
}());
