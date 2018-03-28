import '../app.campaign.module';
import '../service/campaignRestService';
import '../../church/service/churchRestService';
import '../../provingType/service/provingTypeRestService';
import '../../message/messageService';
import '../../../shared/form/validator/formValidatorService';
import 'lodash';

/**
 * @desc This Controller is responsible for handling the view 'campaignRegisterView.html'
 * @author William Custodio
 */
(function () {
    'use strict';

    const module = angular.module('paymentManagement.campaign');

    function CampaignRegisterController($scope, $state, $stateParams, messageService,
                                        formValidatorService, campaignRestService, churchRestService,
                                        provingTypeRestService) {

        const vm = this;

        /**
         * List of all existing churches in the system.
         * @type {Array}
         */
        vm.churches = [];

        /**
         * List of all existing proving types in the system.
         * @type {Array}
         */
        vm.provingTypes = [];

        /**
         * The campaign to be edited/created.
         * @type {{Object}}
         */
        vm.campaign = {
            id: null,
            name: null,
            creationDate: new Date(),
            initialDate: new Date(),
            finalDate: new Date(),
            church: null,
            provingType: null,
            contributions: [],
            beads: []
        };

        /**
         * Function responsible for handling the hook for the initialization of the controller.
         */
        vm.onInit = function() {
            if($stateParams.idCampaign) {
                _loadCampaignById($stateParams.idCampaign);
            }
            _findAllChurch();
            _findAllProvingType();
        };

        /**
         * Handle the on click action for the save button of a campaign.
         */
        vm.saveCampaignOnClick = function() {
            if(_isUpdateAction()) {
                campaignRestService.update(vm.campaign.id, vm.campaign, function() {
                    messageService.showSuccessMessage('application.campaign.register.message.successUpdate');
                    $state.go('^', {}, { reload: true }); // redirect to the catalog page.
                });
            } else if(_isCreateAction()) {
                campaignRestService.create(vm.campaign, function() {
                    messageService.showSuccessMessage('application.campaign.register.message.successCreation');
                    $state.go('^', {}, { reload: true }); // redirect to the catalog page.
                });
            }
        };

        /**
         * Verifies if a certain field of the form contains error or not.
         * @param field The field name to be validated.
         * @param validation The type of the validation to be performed.
         * @returns {boolean}
         */
        vm.hasError = function(field, validation){
            return formValidatorService.hasError($scope.campaignRegisterForm, field, validation);
        };

        /**
         * Load a certain campaign by their identifier.
         * @param {Number} campaignId
         * @private
         */
        function _loadCampaignById(campaignId) {
            campaignRestService.find(campaignId, function(response) {
                vm.campaign = response;
            });
        }

        /**
         * Find all existing churches in the database.
         * @private
         */
        function _findAllChurch() {
            churchRestService.findAll(function(response){
                vm.churches = response._embedded.churches;
            })
        }

        /**
         * Find all existing proving types in the database.
         * @private
         */
        function _findAllProvingType() {
            provingTypeRestService.findAll(function(response){
                vm.provingTypes = response._embedded.provingTypes;
            })
        }

        /**
         * Verifies if the action is an update.
         * @returns {Boolean}
         * @private
         */
        function _isUpdateAction() {
            return $stateParams.idCampaign || vm.campaign.id;
        }

        /**
         * Verifies if the action is an create.
         * @returns {boolean}
         * @private
         */
        function _isCreateAction() {
            return !$stateParams.idCampaign && !vm.campaign.id;
        }
    }
    module.controller('campaignRegisterController', [
        '$scope',
        '$state',
        '$stateParams',
        'messageService',
        'formValidatorService',
        'campaignRestService',
        'churchRestService',
        'provingTypeRestService',
        CampaignRegisterController
    ]);
}());
