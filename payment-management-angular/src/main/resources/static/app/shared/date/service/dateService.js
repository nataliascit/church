import '../app.date.module';

/**
 * @desc This Controller is responsible for handling the services for all date inputs.
 * @author William Custodio
 */
(function () {
    'use strict';

    const module = angular.module('paymentManagement.date');

    function ConfirmationModalService() {

        const _dateRegEx = /^\d{4}-\d{2}-\d{2}$/;

        /**
         * Convert all the dates inside an object.
         * @param object The object owner of the dates.
         * @private
         */
        function _convertDates(input) {
            if (!angular.isObject(input)) {
                return input;
            }
            angular.forEach(input, function (value, key) {
                if (_isDate(value)) {
                    input[key] = new Date(value);
                } else if (angular.isObject(value)) {
                    _convertDates(value);
                }
            });
        }

        /**
         * Verifies if the string is a date.
         * @param value The value to be validated.
         * @returns {boolean}
         * @private
         */
        function _isDate(value) {
            return angular.isString(value) && _dateRegEx.test(value);
        }

        return {
            convertDates : _convertDates
        }
    }
    module.service('dateService', [
        ConfirmationModalService
    ]);
}());