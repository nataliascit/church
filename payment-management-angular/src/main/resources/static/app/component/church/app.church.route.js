import './app.church.module';
import './catalog/churchCatalogController';

/**
 * @desc Configures the church routes.
 * @param $stateProvider The responsible for defining the routes.
 * @author wcustodio
 */
(function () {
    'use strict';

    var module = angular.module('paymentManagement.church');

    module.config(['$stateProvider', function ($stateProvider) {

        $stateProvider.state('application.church', {
            url: '/churches',
            templateUrl: 'app/component/church/catalog/churchCatalogView.html',
            controller: 'churchCatalogController as vm'
        })
    }]);
}());