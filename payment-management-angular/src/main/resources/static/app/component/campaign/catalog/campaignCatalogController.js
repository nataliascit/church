import '../app.campaign.module';
import '../service/campaignRestService';

/**
 * @desc This Controller is responsible for handling the view 'campaignCatalogView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var campaignModule = angular.module('paymentManagement.campaign');

    function CampaignCatalogController(){}

    campaignModule.controller('campaignCatalogController', [CampaignCatalogController]);
}());