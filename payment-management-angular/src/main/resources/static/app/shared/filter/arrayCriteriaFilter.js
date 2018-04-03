import 'lodash';

/**
 * @desc Configures the filter based on a criteria.
 * @author William Custodio
 */
(function () {
    'use strict';

    const module = angular.module('paymentManagement.filter');

    function ArrayFilterCriteria() {

        /**
         * Filter by all the criteria defined by the filter.
         * @param object {Object} The object to be validated.
         * @param criteria {Object} The criteria used to filter.
         * @param ignoreCase {boolean} Defines if the case will be ignored.
         * @returns {boolean} <code>true: </code> The object will be filtered.
         * @private           <code>false: </code> The object won't be filtered.
         */
        function _filterByCriteria(object, criteria, ignoreCase) {
            var matches = true;
            for(var key in criteria) {
                if(object.hasOwnProperty(key) && !_.isEmpty(criteria[key])) {
                    if(typeof object[key] === 'string') {
                        var objectValue = ignoreCase ? object[key].toLowerCase() : object[key];
                        var criteriaValue = ignoreCase ? criteria[key].toLowerCase() : criteria[key];
                        matches = matches && _.includes(objectValue, criteriaValue);
                    } else {
                        matches = matches && (object[key] === criteria[key]);
                    }
                }
            }
            return matches;
        }

        /**
         * Filter an array based on a criteria.
         * @param array {Object} The array to be filtered.
         * @param criteria {Object} The criteria used as filter.
         * @param ignoreCase {boolean} Defines if the case will be ignored.
         * @returns {*} The filtered array.
         * @private
         */
        function _filter(array, criteria, ignoreCase) {
            return array.filter(function(object) {
                return _filterByCriteria(object, criteria, ignoreCase)
            })
        }

        return function(array, criteria, ignoreCase) {
            if(Array.isArray(array) && criteria) {
                return _filter(array, criteria, ignoreCase);
            }
            return array;
        }
    }
    module.filter('filterByCriteria', ArrayFilterCriteria);
}());