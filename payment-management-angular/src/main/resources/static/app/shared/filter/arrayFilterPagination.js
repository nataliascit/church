/**
 * @desc Configures the filter based on a offset and limit.
 * @author William Custodio
 */
(function () {
    'use strict';

    const module = angular.module('paymentManagement.filter');

    function ArrayFilterPagination() {
        return function(array, offset, limit) {
            if(Array.isArray(array)) {
                return array.slice(((offset-1)*limit), ((offset)*limit))
            }
            return array;
        }
    }
    module.filter('filterByPagination', ArrayFilterPagination);
}());