import 'angular-resource';
import 'angular-utils-pagination';
import '@uirouter/angularjs';
import '../modal/app.modal.module';
import '../breadcrumb/app.breadcrumb.module';
import '../../shared/form/app.form.module';
import '../../shared/filter/app.filter.module';
import '../../shared/environment/app.environment.module';
import '../../shared/environment/config/app.environment.constant';

/**
 * @desc Configures the contributor module.
 * @author William Custodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.contributor', [
        'angularUtils.directives.dirPagination',
        'ui.router',
        'ngResource',
        'paymentManagement.breadcrumb',
        'paymentManagement.environment',
        'paymentManagement.modal',
        'paymentManagement.filter',
        'paymentManagement.form',
        'paymentManagement.date'
    ]);
}());