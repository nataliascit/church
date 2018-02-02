import './app.environment.module';

/**
  * @desc Configures the module responsible for holding the environment configuration.
  * @author wcustodio
  */
(function() {
	'use strict';

    var environmentConfig = {
        apiBaseUrl: window.location.origin + '/api',
        availableLanguages: ['pt_BR']
    };
	angular.module('paymentManagement.environment').constant("environmentConfig", environmentConfig);
}());