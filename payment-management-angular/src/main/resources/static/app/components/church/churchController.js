import './app.church.module';
import './churchRestService';

/**
 * @desc This Controller is responsible for handling the view 'churchView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var churchModule = angular.module('paymentManagement.church');

    function ChurchController(){}

    churchModule.controller('churchController', [ChurchController]);
}());