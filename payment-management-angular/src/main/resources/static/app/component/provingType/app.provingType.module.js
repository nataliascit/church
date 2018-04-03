/* Core dependencies */
import 'angular-resource';
/* Shared components */
import '../../shared/environment/app.environment.module';
import '../../shared/environment/config/app.environment.constant';

/**
 * @desc Configures the proving type module.
 * @author William Custodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.provingType', [
        'ngResource',
        'paymentManagement.environment'
    ]);
}());