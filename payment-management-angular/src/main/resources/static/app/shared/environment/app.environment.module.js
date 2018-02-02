import 'angular-cookies';
import 'angular-sanitize';
import 'angular-translate';
import '@uirouter/angularjs';
import 'angular-translate-storage-cookie';
import 'angular-translate-loader-static-files';

/**
  * @desc Configures the module responsible for holding the environment configuration.
  * @author wcustodio
  */
(function() {
	'use strict';
	
	angular.module('paymentManagement.environment', ['ui.router', 'ngCookies', 'ngSanitize', 'pascalprecht.translate']);
}());