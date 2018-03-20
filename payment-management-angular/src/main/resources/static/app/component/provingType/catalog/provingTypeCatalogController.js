import '../app.provingType.module';
import '../service/provingTypeRestService';

/**
 * @desc This Controller is responsible for handling the view 'provingTypeCatalogView.html'
 * @author William Custodio
 */
(function () {
    'use strict';

    var provingTypeModule = angular.module('paymentManagement.provingType');

    function ProvingTypeCatalogController(){}

    provingTypeModule.controller('provingTypeCatalogController', [ProvingTypeCatalogController]);
}());