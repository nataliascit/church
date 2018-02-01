import 'angular-resource';

import '../../shared/environment/environmentConfig';
import '../../shared/environment/app.environment.module';

/**
 * @desc Configures the existing application's modules.
 *	@authour wcustodio
 */
(function() {
	'use strict';
	
	angular.module('paymentManagement.church', ['ngResource', 'paymentManagement.environment']);
}());