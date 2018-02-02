/* Import for application main dependencies. */
import 'angular';
/* Import for all existing components. */
import './shared/home/app.home.module';
import './components/bead/app.bead.module';
import './components/church/app.church.module';
import './components/report/app.report.module';
import './components/campaign/app.campaign.module'
import './components/contributor/app.contributor.module';
import './components/provingType/app.provingType.module';
import './components/contribution/app.contribution.module';
/* Import for configuration modules. */
import './shared/environment/app.routes';
import './shared/environment/app.translations';
import './shared/environment/app.environment.module';
import './shared/environment/app.environment.variables';
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
        'paymentManagement.report',
        'paymentManagement.environment'
    ]);
})();