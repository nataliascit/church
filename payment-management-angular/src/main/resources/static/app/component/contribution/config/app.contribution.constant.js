import '../app.contribution.module';

/**
 * @desc Configures the contribution module.
 * @author William Custodio
 */
(function () {
    'use strict';

    /**
     * Mapper used to map the name of the property in a contribution JSON object and its representation as link.
     * @type {*[]}
     */
    const CONTRIBUTION_LINK_PROPERTY_MAPPER = [{
        name: 'campaign',
        link: '/campaigns/%s',
    }, {
        name: 'contributor',
        link: '/contributors/%s'
    }];
    angular.module('paymentManagement.contribution').constant("CONTRIBUTION_LINK_PROPERTY_MAPPER", CONTRIBUTION_LINK_PROPERTY_MAPPER);
}());