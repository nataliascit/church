import '../app.bead.module';

/**
 * @desc Defines the functions used to execute HTTP requests to retrieve or manage the content of a Bead.
 * @param $resource The responsible for configuring the api entry points.
 * @author William Custodio
 */
(function () {
    'use strict';

    var module = angular.module('paymentManagement.bead');

    function BeadRestService(environmentConfig, $resource) {

        var resources = $resource(environmentConfig.apiBaseUrl + '/beads/:id', null, {
            'create': {
                method: 'POST'
            },
            'update': {
                method: 'PUT'
            },
            'remove': {
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
         * Create a bead.
         *
         * @params {Object} [bead]
         *         The bead to be persisted.
         * @params {function} [successCallback]
         *         The function which will handle the success callback.
         * @params {function} [errorCallback]
         *         The function which will handle the error callback.
         * @private
         */
        function _create(bead, successCallback, errorCallback) {
            return resources.create(null, bead, successCallback, errorCallback);
        }

        /**
         * Update an existing bead on the database.
         *
         * @params {number} [id]
         *         The identifier of the bead to be updated.
         * @params {Object} [bead]
         *         The bead to be updated.
         * @params {function} [successCallback]
         *         The function which will handle the success callback.
         * @params {function} [errorCallback]
         *         The function which will handle the error callback.
         * @private
         */
        function _update(id, bead, successCallback, errorCallback) {
            var params = {
                id: id
            };
            return resources.update(params, bead, successCallback, errorCallback);
        }

        /**
         * Delete an existing bead from the database.
         *
         * @params {number} [id]
         *         The identifier of the bead to be deleted.
         * @params {function} [successCallback]
         *         The function which will handle the success callback.
         * @params {function} [errorCallback]
         *         The function which will handle error callback.
         * @private
         */
        function _remove(id, successCallback, errorCallback) {
            var params = {
                id: id
            };
            return resources.remove(params, null, successCallback, errorCallback);
        }

        /**
         * Search for all existing beads on the database.
         *
         * @params {function} [successCallback]
         *        The function which will handle the success callback.
         * @params {function} [errorCallback]
         *      The function which will handle the error callback.
         * @return result The list of all existing beads.
         * @private
         */
        function _findAll(successCallback, errorCallback) {
            return resources.findAll(null, null, successCallback, errorCallback);
        }

        /**
         * Search for an existing bead on the database by its identifier.
         *
         * @params {number} [id]
         *         The identifier of the bead to be searched.
         * @params {function} [successCallback]
         *         The function which will handle the success callback.
         * @params {function} [errorCallback]
         *         The function which will handle the error callback.
         * @return result The found bead.
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
    }
    module.service('beadRestService', ['environmentConfig', '$resource', BeadRestService]);
}());