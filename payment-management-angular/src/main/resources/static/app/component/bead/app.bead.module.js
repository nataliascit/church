import 'angular-resource';

import '../../shared/environment/app.environment.module';
import '../../shared/environment/config/app.environment.constant';

/**
 * @desc Configures the bead module.
 * @author William Custodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.bead', [
        'ngResource',
        'paymentManagement.environment'
    ]);
}());