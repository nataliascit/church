/* Import for application main dependencies. */
import 'angular';
/* Import for styling. */
import 'bootstrap';
import '../assets/sass/index.scss';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';

/**
 * @description Configures the entire applications.
 * @author wcustodio
 */
(function () {
    'use strict';

    /* Import for all existing component. */
    var componentRequiredFiles = require.context("./component", true, /^(.*\.(js$))[^.]*$/igm);
    componentRequiredFiles.keys().forEach(componentRequiredFiles);
    /* Import for configuration modules. */
    var sharedRequiredFiles = require.context("./shared", true, /^(.*\.(js$))[^.]*$/igm);
    sharedRequiredFiles.keys().forEach(sharedRequiredFiles);

    angular.module('paymentManagement', [
        'paymentManagement.bead',
        'paymentManagement.campaign',
        'paymentManagement.church',
        'paymentManagement.contribution',
        'paymentManagement.contributor',
        'paymentManagement.home',
        'paymentManagement.provingType',
        'paymentManagement.environment',
        'paymentManagement.menu',
        'paymentManagement.message'
    ]);
})();