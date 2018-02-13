import '../app.environment.module';

/**
 * @desc Configures the module responsible for holding the message service constants.
 * @author wcustodio
 */
(function () {
    'use strict';

    /**
     * Catalog used to map the possible css class by each message type.
     * @type {{DEFAULT: string, INFO: string, WARN: string, ERROR: string}}
     */
    const CSS_CLASS_CATALOG = {
        'DEFAULT': 'alert alert-success',
        'INFO': 'alert alert-info',
        'WARN': 'alert alert-warning',
        'ERROR': 'alert alert-danger'
    };
    angular.module('paymentManagement').constant("CSS_CLASS_CATALOG", CSS_CLASS_CATALOG);

    /**
     * Catalog used to map the possible timeout by each message type.
     * @type {{DEFAULT: number, INFO: number, WARN: number, ERROR: number}}
     */
    const TIMEOUT_CATALOG = {
        'DEFAULT': 1500,
        'INFO': 1000,
        'WARN': 1500,
        'ERROR': 1500
    };
    angular.module('paymentManagement').constant("TIMEOUT_CATALOG", TIMEOUT_CATALOG);
}());