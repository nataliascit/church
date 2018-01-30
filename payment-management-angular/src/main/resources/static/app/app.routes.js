import '@uirouter/angularjs';

import './components/bead/beadController';
import './components/campaign/campaignController';
import './components/church/churchController';
import './components/contribution/contributionController';
import './components/contributor/contributorController';
import './components/provingType/provingTypeController';

import './shared/home/homeController';

/**
  * @desc Configures the routes used to navigae over the application.
  * @param $stateProvider The responsible for defining the routes.
  * @param $urlRouterProvider The responsible for defining the default path.  
  * @author wcustodio
  */
(function(){
    'use strict';

    angular.module('paymentManagement.routes', ['ui.router']);

    angular.module('paymentManagement.routes').config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise('/');

		$stateProvider
			.state('application', {
				abstract: true
			})
            .state('application.home', {
                url: '/',
                templateUrl: 'app/shared/home/homeView.html',
                controller: 'homeController as vm'
            })
			.state('application.bead', {
				url: '/beads/:id',
				templateUrl: 'app/components/bead/beadView.html',
				controller: 'beadController as vm'
			})
			.state('application.campaign', {
				url: '/campaigns/:id',
				templateUrl: 'app/components/campaign/campaignView.html',
				controller: 'campaignController as vm'
			})
			.state('application.church', {
				url: '/churches/:id',
				templateUrl: 'app/components/church/churchView.html',
				controller: 'churchController as vm'
			})
			.state('application.contribution', {
				url: '/contributions/:id',
				templateUrl: 'app/components/contribution/contributionView.html',
				controller: 'contributionController as vm'
			})
			.state('application.contributor', {
				url: '/contributors/:id',
				templateUrl: 'app/components/contributor/contributorView.html',
				controller: 'contributorController as vm'
			})
			.state('application.provingType', {
				url: '/provingTypes/:id',
				templateUrl: 'app/components/provingType/provingTypeView.html',
				controller: 'provingTypeController as vm'		
			});
    });
})();