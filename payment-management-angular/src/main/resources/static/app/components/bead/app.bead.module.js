import '../../shared/environment/app.environment.module';
import '../../shared/environment/environmentValue';

/**
 * @desc Configures the bead module.
 * @author wcustodio
 */
(function() {
	'use strict';
	
	angular.module('paymentManagement.bead', ['paymentManagement.environment']);
}());