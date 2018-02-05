import 'angular-resource';

import '../../shared/environment/app.environment.variables';
import '../../shared/environment/app.environment.module';

/**
 * @desc Configures the registerCampaign module.
 *    @author wcustodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.registerCampaign', ['ngResource', 'paymentManagement.environment']);
}());
