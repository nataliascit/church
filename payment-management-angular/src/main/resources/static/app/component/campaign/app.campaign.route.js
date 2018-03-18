import './app.campaign.module';
import './catalog/campaignCatalogController';
import './register/campaignRegisterController';

/**
 * @desc Configures the bead routes.
 * @param $stateProvider The responsible for defining the routes.
 * @author William Custodio
 */
(function () {
    'use strict';

    var module = angular.module('paymentManagement.campaign');

    module.config(['$stateProvider', function ($stateProvider) {

        $stateProvider.state('application.campaign', {
            url: '/campaigns',
            templateUrl: 'app/component/campaign/catalog/campaignCatalogView.html',
            controller: 'campaignCatalogController as vm',
            breadcrumb: {
                label: 'application.campaign.catalog.label.title',
                force: true,
                stateOptions: {
                    reload: true
                }
            }
        })
        .state('application.campaign.register', {
            url: '/:id',
            templateUrl: 'app/component/campaign/register/campaignRegisterView.html',
            controller: 'campaignRegisterController as vm',
            params: {
                id: null
            },
            breadcrumb: {
                label: 'application.campaign.register.label.title',
                force: true
            }
        })
    }]);
}());