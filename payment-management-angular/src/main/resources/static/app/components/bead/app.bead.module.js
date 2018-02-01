import 'angular-resource';

import '../../shared/environment/environmentConfig';
import '../../shared/environment/app.environment.module';

/**
 * @desc Configures the bead module.
 * @author wcustodio
 */
(function() {
	'use strict';
	
	angular.module('paymentManagement.bead', ['ngResource', 'paymentManagement.environment']);
}());