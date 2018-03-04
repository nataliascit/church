import '../app.church.module';
import '../service/churchRestService';

/**
 * @desc This Controller is responsible for handling the view 'churchCatalogView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var churchModule = angular.module('paymentManagement.church');

    function ChurchCatalogController(){
    }

    churchModule.controller('churchCatalogController', [ChurchCatalogController]);
}());