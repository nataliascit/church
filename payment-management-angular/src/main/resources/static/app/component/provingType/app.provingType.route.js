import './app.provingType.module';
import './catalog/provingTypeCatalogController';

/**
 * @desc Configures the proving type routes.
 * @param $stateProvider The responsible for defining the routes.
 * @author wcustodio
 */
(function () {
    'use strict';

    var beadModule = angular.module('paymentManagement.provingType');

    beadModule.config(['$stateProvider', function ($stateProvider) {

        $stateProvider.state('application.provingType', {
            url: '/provingTypes',
            templateUrl: 'app/component/provingType/catalog/provingTypeCatalogView.html',
            controller: 'provingTypeCatalogController as vm'
        })
    }]);
}());