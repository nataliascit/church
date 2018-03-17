import './app.contributor.module';
import './catalog/contributorCatalogController';
import './register/contributorRegisterController';

/**
 * @desc Configures the contributor routes.
 * @param $stateProvider The responsible for defining the routes.
 * @author wcustodio
 */
(function () {
    'use strict';

    var module = angular.module('paymentManagement.contributor');

    module.config(['$stateProvider', function ($stateProvider) {

        $stateProvider.state('application.contributor', {
            url: '/contributors',
            templateUrl: 'app/component/contributor/catalog/contributorCatalogView.html',
            controller: 'contributorCatalogController as vm',
            breadcrumb: {
                label: 'application.contributor.catalog.label.title',
                force: true,
                stateOptions: {
                    reload: true
                }
            }
        })
        .state('application.contributor.register', {
            url: '/:id',
            templateUrl: 'app/component/contributor/register/contributorRegisterView.html',
            controller: 'contributorRegisterController as vm',
            params: {
                id: null
            },
            breadcrumb: {
                label: 'application.contributor.register.label.title',
                force: true
            }
        })
    }]);
}());