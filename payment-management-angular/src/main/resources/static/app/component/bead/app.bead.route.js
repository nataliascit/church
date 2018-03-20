import './app.bead.module';
import './catalog/beadCatalogController';

/**
 * @desc Configures the bead routes.
 * @param $stateProvider The responsible for defining the routes.
 * @author William Custodio
 */
(function () {
    'use strict';

    var module = angular.module('paymentManagement.bead');

    module.config(['$stateProvider', function ($stateProvider) {

        $stateProvider.state('application.bead', {
            url: '/beads',
            templateUrl: 'app/component/bead/catalog/beadCatalogView.html',
            controller: 'beadController as vm',
            breadcrumb: {
                label: 'application.bead.catalog.label.title',
                force: true,
                stateOptions: {
                    reload: true
                }
            }
        })
    }]);
}());