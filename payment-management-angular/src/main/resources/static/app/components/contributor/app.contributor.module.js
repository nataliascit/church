import 'angular-resource';

import '../../shared/environment/environmentConfig';
import '../../shared/environment/app.environment.module';

/**
 * @desc Configures the contributor module.
 * @author wcustodio
 */
(function() {
	'use strict';
	
	angular.module('paymentManagement.contributor', ['ngResource', 'paymentManagement.environment']);
}());