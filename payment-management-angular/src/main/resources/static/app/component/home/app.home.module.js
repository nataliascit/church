import '@uirouter/angularjs';

import '../breadcrumb/app.breadcrumb.module';

import '../../shared/environment/app.environment.module';
import '../../shared/environment/config/app.environment.constant';

/**
 * @desc Configures the home module.
 * @author William Custodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.home', [
        'ui.router',
        'paymentManagement.breadcrumb'
    ]);
}());