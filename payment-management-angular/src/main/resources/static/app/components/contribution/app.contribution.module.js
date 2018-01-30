import 'angular-resource';

import '../../shared/environment/app.environment.module';
import '../../shared/environment/environmentValue';

/**
 * @desc Configures the contribution module.
 * @author wcustodio
 */	
(function() {
	'use strict';	

	angular.module('paymentManagement.contribution', ['ngResource', 'paymentManagement.environment']);
}());