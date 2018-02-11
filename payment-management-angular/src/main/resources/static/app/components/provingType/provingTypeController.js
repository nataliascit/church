import './app.provingType.module';
import './provingTypeRestService';

/**
 * @desc This Controller is responsible for handling the view 'provingTypeView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var provingTypeModule = angular.module('paymentManagement.provingType');

    function ProvingTypeController(){}

    provingTypeModule.controller('provingTypeController', [ProvingTypeController]);
}());