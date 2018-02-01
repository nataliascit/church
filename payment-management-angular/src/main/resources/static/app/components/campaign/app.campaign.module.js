import 'angular-resource';

import '../../shared/environment/environmentConfig';
import '../../shared/environment/app.environment.module';

/**
 * @desc Configures the campaign module.
 *	@author wcustodio
 */
(function() {
	'use strict';
	
	angular.module('paymentManagement.campaign', ['ngResource', 'paymentManagement.environment']);
}());