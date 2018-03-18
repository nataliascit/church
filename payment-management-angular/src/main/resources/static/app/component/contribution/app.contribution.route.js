import './app.contribution.module';
import './catalog/contributionCatalogController';

/**
 * @desc Configures the contribution routes.
 * @param $stateProvider The responsible for defining the routes.
 * @author William Custodio
 */
(function () {
    'use strict';

    var module = angular.module('paymentManagement.contribution');

    module.config(['$stateProvider', function ($stateProvider) {

        $stateProvider.state('application.contribution', {
            url: '/contributions',
            templateUrl: 'app/component/contribution/catalog/contributionCatalogView.html',
            controller: 'contributionCatalogController as vm',
            breadcrumb: {
                label: 'application.contribution.catalog.label.title',
                force: true,
                stateOptions: {
                    reload: true
                }
            }
        })
    }]);
}());