import 'angular-resource';

import '../../shared/environment/app.environment.module';
import '../../shared/environment/environmentValue';

/**
 * @desc Configures the proving type module.
 * @author wcustodio
 */
(function() {
	'use strict';

	angular.module('paymentManagement.provingType', ['ngResource', 'paymentManagement.environment']);
}());