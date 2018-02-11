/* Import for application main dependencies. */
import 'angular';
/* Import for all existing components. */
import './components/home/app.home.module';
import './components/bead/app.bead.module';
import './components/church/app.church.module';
import './components/reports/app.report.module';
import './components/campaign/app.campaign.module';
import './components/contributor/app.contributor.module';
import './components/provingType/app.provingType.module';
import './components/contribution/app.contribution.module';

import './components/menus/mainMenu/mainMenuComponent';
/* Import for configuration modules. */
import './shared/environment/app.environment.module';
import './shared/environment/route/app.routes';
import './shared/environment/translate/app.translations';
import './shared/environment/config/app.environment.variables';
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

    angular.module('paymentManagement', [
        'paymentManagement.bead',
        'paymentManagement.campaign',
        'paymentManagement.church',
        'paymentManagement.contribution',
        'paymentManagement.contributor',
        'paymentManagement.home',
        'paymentManagement.provingType',
        'paymentManagement.reports',
        'paymentManagement.environment',
        'paymentManagement.menus'
    ]);
})();