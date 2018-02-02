import './app.environment.module';
import './environmentConfig';

(function(){
    'use strict';

	var environmentModule = angular.module('paymentManagement.environment');
	
	environmentModule.config(['$translateProvider', '$qProvider', 'environmentConfig', function ($translateProvider, $qProvider, environmentConfig) {

		$qProvider.errorOnUnhandledRejections(false);
		
		$translateProvider.useStaticFilesLoader({
			prefix: 'locale-',
			suffix: '.json'
		});
		$translateProvider.registerAvailableLanguageKeys(environmentConfig.availableLanguages, {
		  	'pt*': 'pt_BR',
			'en*': 'pt_BR'
		});
		$translateProvider.use('pt_BR'); 
		// Get the user's system language
		$translateProvider.determinePreferredLanguage();
		// If their system uses a lang we don't support, fall back to this lang
		$translateProvider.fallbackLanguage('pt_BR');
		// Defines the default language.
		$translateProvider.preferredLanguage('pt_BR');
		// Store the user's lang preference
		$translateProvider.useCookieStorage(); 
		// Prevent hacking of interpoloated strings
		$translateProvider.useSanitizeValueStrategy('sanitizeParameters'); 
	}]);
})();