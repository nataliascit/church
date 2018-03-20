import '../app.contributor.module'

/**
 * @desc Configures the contributor module.
 * @author William Custodio
 */
(function () {
    'use strict';

    const GENDER_CATALOG = [{
        'label': 'application.contributor.label.gender.male',
        'value': 'MALE'
    },{
        'label': 'application.contributor.label.gender.female',
        'value': 'FEMALE'
    }];
    angular.module('paymentManagement.contributor').constant("GENDER_CATALOG", GENDER_CATALOG);

    const CIVIL_STATE_CATALOG = [{
        'label': 'application.contributor.label.civilState.divorced',
        'value': 'DIVORCED'
    }, {
        'label': 'application.contributor.label.civilState.married',
        'value': 'MARRIED'
    }, {
        'label': 'application.contributor.label.civilState.single',
        'value': 'SINGLE'
    }, {
        'label': 'application.contributor.label.civilState.stableUnion',
        'value': 'STABLE_UNION'
    }, {
        'label': 'application.contributor.label.civilState.widower',
        'value': 'WIDOWER'
    }];
    angular.module('paymentManagement.contributor').constant("CIVIL_STATE_CATALOG", CIVIL_STATE_CATALOG);
}());