import './app.bead.module';
import './beadRestService';

/**
 * @desc This Controller is responsible for handling the view 'beadView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var beadModule = angular.module('paymentManagement.bead');

    function BeadController() {}

    beadModule.controller('beadController', [BeadController]);
}());