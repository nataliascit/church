package br.com.payment.management.core.campaign.service;

import br.com.payment.management.core.campaign.model.Campaign;
import br.com.payment.management.core.campaign.repository.CampaignRepository;
import br.com.payment.management.core.common.configuration.BaseTestRunner;
import br.com.payment.management.core.common.exception.BusinessException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

/**
 * Class responsible for executing unit tests for {@link CampaignServiceValidatorTest}.
 *
 * @author William Custodio
 */
@Transactional
public class CampaignServiceValidatorTest extends BaseTestRunner {

    @Autowired
    private CampaignRepository campaignRepository;

    @Autowired
    private CampaignServiceValidator campaignServiceValidator;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    /**
     * Constants used as parameters by the unit tests.
     */
    private static final String TITHE_NAME = "Dízimo";

    /**
     * Performs a test to validate when a campaign cannot be deleted due to the fact that it has
     * contributions associated to it.
     */
    @Test
    public void testValidateBeforeDeletionWithAssociatedContributionError() throws BusinessException {
        expectedException.expect(BusinessException.class);
        final Campaign campaign = this.campaignRepository.findByName(TITHE_NAME);
        Assert.assertNotNull(campaign);
        Assert.assertFalse(campaign.getContributions().isEmpty());
        this.campaignServiceValidator.validateBeforeDeletion(campaign);
    }
}
