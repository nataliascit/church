import '../../shared/environment/app.environment.module';
import '../../shared/environment/environmentValue';

/**
 * @desc Configures the existing application's modules.
 *	@authour wcustodio
 */
(function() {
	'use strict';
	
	angular.module('paymentManagement.church', ['paymentManagement.environment']);
}());