import '../app.campaign.module';
import '../service/campaignRestService';

/**
 * @desc This Controller is responsible for handling the view 'campaignRegisterView.html'
 * @author wcustodio
 */
(function () {
    'use strict';

    var campaignModule = angular.module('paymentManagement.campaign');

    function CampaignRegisterController() {}

    campaignModule.controller('campaignRegisterController', [CampaignRegisterController]);
}());
