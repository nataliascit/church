import '../app.springIntegration.module';
import 'sprintf-js';

/**
 * @desc This Controller is responsible for handling the services used to integrate with spring framework.
 * @author William Custodio
 */
(function () {
    'use strict';

    const module = angular.module('paymentManagement.springIntegration');

    function SpringIntegrationService($q, $http, SpringDataRestAdapter) {

        /**
         * Convert all defined properties to a way that spring can read. Ex: '/resource/id'.
         * @param item Item owner of the property to be converted.
         * @param propertiesToConvert list with all the objects tha should be converted. Ex: {name: null, link: null}
         * @private
         */
        function _convertProperty(item, propertiesToConvert) {
            angular.forEach(item, function(property, propertyName) {
                if(Array.isArray(property)) {
                    _convertProperty(property, propertiesToConvert);
                }
                if(_canConvertProperty(propertiesToConvert, propertyName, property)) {
                    // Get the property inside the array of properties.
                    var property = propertiesToConvert.filter(function(property) {
                        return property.name === propertyName;
                    });
                    item[propertyName] = vsprintf(property[0].link, [item[propertyName].id]);
                }
            });
        }

        /**
         * Verifies if the property can be converted.
         * @param propertiesToConvert The array with all the possible properties that can be converted.
         * @param propertyName The name of the property to be validated.
         * @param property The property to be validated.
         * @return {{boolean}} <code>true: <code> The property can be converted. </br>
         *                     <code>false: <code> The property cannot be converted.
         * @private
         */
        function _canConvertProperty(propertiesToConvert, propertyName, property) {
            return _.includes(JSON.stringify(propertiesToConvert), vsprintf(':"%s"', propertyName)) && property.id;
        }

        /**
         * Process all the links associated to the items.
         * @param items The array with all the items owner of the links.
         * @param linksToFetch The array used to define which links should be fetched.
         * @returns {*} All the processed promises.
         * @private
         */
        function _retrieveDataFromItemsLinks(items, linksToFetch) {

            var promises = [];

            // Create a http @GET promise for each link of each item.
            items.forEach(function(item) {
                promises = promises.concat(_retrieveDataFromItemLinks(item, linksToFetch));
            });

            return $q.all(promises);
        }

        /**
         * Process all the links associated to a certain item.
         * @param item The item to be processed owner of the links.
         * @param linksToFetch The array used to define which links should be fetched.
         * @returns {*} The array with all the promises to be processed.
         * @private
         */
        function _retrieveDataFromItemLinks(item, linksToFetch) {

            var promises = [];

            /*
             * Process all the links and create a http @GET promise
             * for each link which name matches the links defined in the 'linksToFetch' array.
             */
            angular.forEach(item._links, function(link, name) {
                // Fetch only the links that were defined.
                if(_.includes(linksToFetch, name)) {
                    promises.push(_buildHttpPromiseFromLink(link.href, function(result) {
                        item[name] = result;
                    }));
                }
            });

            return $q.all(promises);
        }

        /**
         * Build a http @GET promise from a link.
         * @param link The link to be used to retrieve data from the server.
         * @param successCallback The success callback function used to handle the success scenario.
         * @returns {*} The built promise
         * @private
         */
        function _buildHttpPromiseFromLink(link, successCallback) {
            return SpringDataRestAdapter.process($http.get(link)).then(successCallback);
        }

        return {
            convertProperty: _convertProperty,
            retrieveDataFromItemsLinks: _retrieveDataFromItemsLinks,
            retrieveDataFromItemLinks: _retrieveDataFromItemLinks
        }
    }
    module.service('springIntegrationService', [
        '$q',
        '$http',
        'SpringDataRestAdapter',
        SpringIntegrationService
    ]);
}());