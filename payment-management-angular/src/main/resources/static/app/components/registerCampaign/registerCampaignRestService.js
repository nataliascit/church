import './app.registerCampaign.module';

/**
 * @desc Defines the functions used to execute HTTP requests to retrieve or manage the content of a Campaign.
 * @param $resource The responsible for configuring the api entrypoints.
 * @author wcustodio
 */
(function () {
    'use strict';

    var registerCampaignModule = angular.module('paymentManagement.registerCampaign');

    registerCampaignModule.$inject = ['environmentConfig', '$resource'];

    registerCampaignModule.service('registerCampaignRestService', function (environmentConfig, $resource) {

        var resources = $resource(environmentConfig.apiBaseUrl + '/registerCampaigns/:id', null, {
            'create': {
                method: 'POST'
            },
            'update': {
                method: 'PUT'
            },
            'delete': {
                method: 'DELETE'
            },
            'find': {
                method: 'GET'
            },
            'findAll': {
                method: 'GET'
            }
        });

        /**
         * Create a registerCampaign.
         *
         * @params {Object} [registerCampaign]
         *         The registerCampaign to be persisted.
         * @params {function} [successCallback]
         *         The function which will handle the success callback.
         * @params {function} [errorCallback]
         *         The function which will handle the error callback.
         * @private
         */
        function _create(registerCampaign, successCallback, errorCallback) {
            return resources.create(null, registerCampaign, successCallback, errorCallback);
        }

        /**
         * Update an existing registerCampaign on the database.
         *
         * @params {number} [id]
         *         The identifier of the registerCampaign to be updated.
         * @params {Object} [registerCampaign]
         *         The registerCampaign to be updated.
         * @params {function} [successCallback]
         *         The function which will handle the success callback.
         * @params {function} [errorCallback]
         *         The function which will handle the error callback.
         * @private
         */
        function _update(id, registerCampaign, successCallback, errorCallback) {
            var params = {
                id: id
            };
            return resources.update(params, registerCampaign, successCallback, errorCallback);
        }

        /**
         * Delete an existing registerCampaign from the database.
         *
         * @params {number} [id]
         *         The identifier of the registerCampaign to be deleted.
         * @params {function} [successCallback]
         *         The function which will handle the success callback.
         * @params {function} [errorCallback]
         *         The function which will handle error callback.
         * @private
         */
        function _remove(applicationId, successCallback, errorCallback) {
            var params = {
                applicationId: applicationId
            };
            return applications.remove(params, null, successCallback, errorCallback);
        }

        /**
         * Search for all existing churches on the database.
         *
         * @params {function} [successCallback]
         *        The function which will handle the success callback.
         * @params {function} [errorCallback]
         *      The function which will handle the error callback.
         * @return result The list of all existing churches.
         * @private
         */
        function _findAll(successCallback, errorCallback) {
            return resources.findAll(null, null, successCallback, errorCallback);
        }

        /**
         * Search for an existing registerCampaign on the database by its identifier.
         *
         * @params {number} [id]
         *         The identifier of the registerCampaign to be searched.
         * @params {function} [successCallback]
         *         The function which will handle the success callback.
         * @params {function} [errorCallback]
         *         The function which will handle the error callback.
         * @return result The found registerCampaign.
         * @private
         */
        function _find(id, successCallback, errorCallback) {
            var params = {
                id: id
            };
            return resources.find(params, null, successCallback, errorCallback);
        }

        return {
            create: _create,
            update: _update,
            remove: _remove,
            find: _find,
            findAll: _findAll
        }
    });
}());
