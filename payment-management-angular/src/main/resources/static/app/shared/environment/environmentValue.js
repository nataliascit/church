import './app.environment.module';

/**
  * @desc Configures the module responsible for holding the environment configuration.
  * @author wcustodio
  */
(function() {
	'use strict'; 
 
	angular.module('paymentManagement.environment').value("environmentValue", {
		apiBaseUrl: window.location.origin + '/api'
	});
}());