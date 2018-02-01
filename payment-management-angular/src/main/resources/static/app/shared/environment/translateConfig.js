import './app.environment.module';
import './environmentConfig';
import './locale/pt_BR.json';

/**
  * @desc Configures the translations used to navigate over the application.
  * @param $translateProvider
  * @param $httpProvider
  * @author wcustodio
  */
(function(){
    'use strict';

	var environmentModule = angular.module('paymentManagement.environment');
	
	environmentModule.config(['$translateProvider', 'environmentConfig', function ($translateProvider, environmentConfig) {

        // saved selected language in a cookie
        $translateProvider.useCookieStorage();

        // define source of translations
        $translateProvider.useStaticFilesLoader({
            prefix: 'locale/',
            suffix: '.json'
        });

        // define available languages and map wildcards (e.g. for en_GB
        // the en_US translations will be used. )
        $translateProvider.registerAvailableLanguageKeys(environmentConfig.languages, {
            'pt*': 'pt_BR'
        }).fallbackLanguage('pt_BR');
        // fallbackLanguage is for translations of keys (e.g. if a key
        // is not found in de_DE the value of en_US will be used)

        // detect preferred language based on users browser config
        $translateProvider.determinePreferredLanguage();

        // requires angular-sanitize
        $translateProvider.useSanitizeValueStrategy('sanitize');
    }]);
})();