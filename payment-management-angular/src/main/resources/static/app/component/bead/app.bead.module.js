import '@uirouter/angularjs';
import 'angular-resource';
import '../../shared/environment/config/app.environment.constant';
import '../../shared/environment/app.environment.module';

/**
 * @desc Configures the bead module.
 * @author wcustodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.bead', ['ui.router', 'ngResource', 'paymentManagement.environment']);
}());