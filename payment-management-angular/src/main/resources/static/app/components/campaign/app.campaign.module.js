import 'angular-resource';

import '../../shared/environment/app.environment.module';
import '../../shared/environment/environmentValue';

/**
 * @desc Configures the campaign module.
 *	@author wcustodio
 */
(function() {
	'use strict';
	
	angular.module('paymentManagement.campaign', ['ngResource', 'paymentManagement.environment']);
}());