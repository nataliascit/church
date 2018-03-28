import '@uirouter/angularjs';
import 'angular-resource';
import 'angular-utils-pagination';
import '../../shared/environment/config/app.environment.constant';
import '../../shared/environment/app.environment.module';
import '../breadcrumb/app.breadcrumb.module';

/**
 * @desc Configures the campaign module.
 *    @author William Custodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.campaign', [
        'angularUtils.directives.dirPagination',
        'ui.router',
        'ngResource',
        'paymentManagement.breadcrumb',
        'paymentManagement.environment'
    ]);
}());