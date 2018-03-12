import '../../../node_modules/ui-router-breadcrumbs/ui-router-breadcrumbs';
import '../../../node_modules/ui-router-breadcrumbs/ui-router-breadcrumbs.min.css';

/**
 * @desc Configures the module responsible for holding the environment configuration.
 * @author wcustodio
 */
(function () {
    'use strict';

    angular.module('paymentManagement.breadcrumb', ['ui.router', 'uiBreadcrumbs']);
}());