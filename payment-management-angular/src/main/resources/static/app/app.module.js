/**
 * @desc Configures the existing application's modules.
 * @author wcustodio
 */
import 'jquery';
import 'angular';
import 'angular-route';
import 'angular-messages';
import 'angular-resource';
import '@uirouter/angularjs';
import 'bootstrap';

import '../node_modules/bootstrap/dist/css/bootstrap.min.css';

angular.module('paymentManagement', [

    /* angular dependencies. */
    'ngResource',
    'ngMessages',
    'ui.router',

    /* application's components dependencies. */
    'paymentManagement.bead',
    'paymentManagement.campaign',
    'paymentManagement.church',
    'paymentManagement.contribution',
    'paymentManagement.contributor',
    'paymentManagement.home',
    'paymentManagement.provingType',

    /* application's shared dependencies. */
    'paymentManagement.environment'
]);