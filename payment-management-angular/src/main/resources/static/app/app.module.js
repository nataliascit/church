/**
  * @desc Configures the existing application's modules.
  * @author wcustodio
  */
(function(){
    'use strict';
	
    angular.module('paymentManagement', [

        /* angular dependencies. */
        'ngResource',
        'ngMessages',
        'ui.router',

        /* application's components dependencies. */
        'paymentManagement.bead',
        'paymentManagement.campaign',
        'paymentManagement.church',
        'paymentManagement.contribution',
        'paymentManagement.contributor',
        'paymentManagement.home',
        'paymentManagement.provingType',

        /* application's shared dependencies. */
        'paymentManagement.environment'
    ]);
})();