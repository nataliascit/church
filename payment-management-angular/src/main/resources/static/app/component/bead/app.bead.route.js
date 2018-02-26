import './app.bead.module';
import './catalog/beadCatalogController';

/**
 * @desc Configures the bead routes.
 * @param $stateProvider The responsible for defining the routes.
 * @author wcustodio
 */
(function () {
    'use strict';

    var beadModule = angular.module('paymentManagement.bead');

    beadModule.config(['$stateProvider', function ($stateProvider) {

        $stateProvider.state('application.bead', {
            url: '/beads',
            templateUrl: 'app/component/bead/catalog/beadCatalogView.html',
            controller: 'beadController as vm'
        })
    }]);
}());