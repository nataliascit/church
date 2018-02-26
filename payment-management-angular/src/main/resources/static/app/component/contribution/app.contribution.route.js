import './app.contribution.module';
import './catalog/contributionCatalogController';

/**
 * @desc Configures the contribution routes.
 * @param $stateProvider The responsible for defining the routes.
 * @author wcustodio
 */
(function () {
    'use strict';

    var beadModule = angular.module('paymentManagement.contribution');

    beadModule.config(['$stateProvider', function ($stateProvider) {

        $stateProvider.state('application.contribution', {
            url: '/contributions',
            templateUrl: 'app/component/contribution/catalog/contributionCatalogView.html',
            controller: 'contributionCatalogController as vm'
        })
    }]);
}());