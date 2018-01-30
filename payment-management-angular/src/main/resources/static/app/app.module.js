import 'angular';
import 'bootstrap';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';

import './components/bead/app.bead.module';
import './components/campaign/app.campaign.module';
import './components/church/app.church.module';
import './components/contribution/app.contribution.module';
import './components/contributor/app.contributor.module';
import './components/provingType/app.provingType.module';

import './shared/environment/app.environment.module';
import './shared/home/app.home.module';

import './app.routes'

/**
  * @description Configures the entire applications.  
  * @author wcustodio
  */
(function(){
    'use strict';
  
	angular.module('paymentManagement', [
		'paymentManagement.bead',
		'paymentManagement.campaign',
		'paymentManagement.church',
		'paymentManagement.contribution',
		'paymentManagement.contributor',
		'paymentManagement.home',
		'paymentManagement.provingType',
		'paymentManagement.environment',
        'paymentManagement.routes'
	]);
})();