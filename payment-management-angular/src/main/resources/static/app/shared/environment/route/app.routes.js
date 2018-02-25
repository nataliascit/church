import '../app.environment.module';
import '../../../component/home/homeController';
import '../../../component/bead/catalog/beadCatalogController';
import '../../../component/campaign/catalog/campaignCatalogController';
import '../../../component/campaign/register/campaignRegisterController';
import '../../../component/church/catalog/churchCatalogController';
import '../../../component/contribution/catalog/contributionCatalogController';
import '../../../component/contributor/catalog/contributorCatalogController';
import '../../../component/contributor/register/contributorRegisterController';
import '../../../component/provingType/catalog/provingTypeCatalogController';

/**
 * @desc Configures the routes used to navigate over the application.
 * @param $stateProvider The responsible for defining the routes.
 * @param $urlRouterProvider The responsible for defining the default path.
 * @author wcustodio
 */
(function () {
    'use strict';

    var environmentModule = angular.module('paymentManagement.environment');

    environmentModule.config(['$stateProvider', '$urlRouterProvider', '$locationProvider', function ($stateProvider, $urlRouterProvider, $locationProvider) {

        $urlRouterProvider.otherwise('/pages/home');

        $locationProvider.html5Mode(true);

        $stateProvider
            .state('application', {
                url: '/pages'
            })
            .state('application.home', {
                url: '/home',
                templateUrl: 'app/component/home/homeView.html',
                controller: 'homeController as vm'
            })
            /* BEADS */
            .state('application.bead', {
                url: '/beads',
                templateUrl: 'app/component/bead/catalog/beadCatalogView.html',
                controller: 'beadController as vm'
            })
            /* CAMPAIGN */
            .state('application.campaign', {
                url: '/campaigns',
                templateUrl: 'app/component/campaign/catalog/campaignCatalogView.html',
                controller: 'campaignCatalogController as vm'
            })
            .state('application.campaign.register', {
                url: '/:id',
                templateUrl: 'app/component/campaign/register/campaignRegisterView.html',
                controller: 'campaignRegisterController as vm',
                params: {
                    id: null
                }
            })
            /* CHURCH */
            .state('application.church', {
                url: '/churches',
                templateUrl: 'app/component/church/catalog/churchCatalogView.html',
                controller: 'churchCatalogController as vm'
            })
            /* CONTRIBUTION */
            .state('application.contribution', {
                url: '/contributions',
                templateUrl: 'app/component/contribution/catalog/contributionCatalogView.html',
                controller: 'contributionCatalogController as vm'
            })
            /* CONTRIBUTOR */
            .state('application.contributor', {
                url: '/contributors',
                templateUrl: 'app/component/contributor/catalog/contributorCatalogView.html',
                controller: 'contributorCatalogController as vm'
            })
            .state('application.contributor.register', {
                url: '/:id',
                templateUrl: 'app/component/contributor/register/contributorRegisterView.html',
                controller: 'contributorRegisterController as vm',
                params: {
                    id: null
                }
            })
            /* PROVING TYPE */
            .state('application.provingType', {
                url: '/provingTypes',
                templateUrl: 'app/component/provingType/catalog/provingTypeCatalogView.html',
                controller: 'provingTypeCatalogController as vm'
            })
    }]);
})();