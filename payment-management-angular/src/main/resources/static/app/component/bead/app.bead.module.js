import 'angular-resource';

import '../../shared/environment/config/app.environment.variables';
import '../../shared/environment/app.environment.module';

/**
 * @desc Configures the bead module.
 * @author wcustodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.bead', ['ngResource', 'paymentManagement.environment']);
}());