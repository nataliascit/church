import 'angular';
import 'bootstrap';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';

import './shared/home/app.home.module';
import './components/bead/app.bead.module';
import './components/church/app.church.module';
import './components/campaign/app.campaign.module';
import './components/contributor/app.contributor.module';
import './components/provingType/app.provingType.module';
import './components/contribution/app.contribution.module';

import './shared/environment/routeConfig';
import './shared/environment/translateConfig';
import './shared/environment/environmentConfig';
import './shared/environment/app.environment.module';

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
		'paymentManagement.environment'
	]);
})();