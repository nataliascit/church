import 'angular-resource';
import '@uirouter/angularjs';
import '../../shared/modal/app.modal.module';
import '../breadcrumb/app.breadcrumb.module';
import '../../shared/form/app.form.module';
import '../../shared/environment/app.environment.module';
import '../../shared/environment/config/app.environment.constant';

/**
 * @desc Configures the contributor module.
 * @author William Custodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.contributor', [
        'ui.router',
        'ngResource',
        'paymentManagement.breadcrumb',
        'paymentManagement.environment',
        'paymentManagement.modal',
        'paymentManagement.form',
        'paymentManagement.date'
    ]);
}());