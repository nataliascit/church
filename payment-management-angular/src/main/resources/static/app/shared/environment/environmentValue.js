/**
  * @desc Configures the module responsible for holding the environment configuration.
  * @author wcustodio
  */
angular.module('paymentManagement.environment').value("environmentValue", {
    apiBaseUrl: window.location.origin + '/api'
});