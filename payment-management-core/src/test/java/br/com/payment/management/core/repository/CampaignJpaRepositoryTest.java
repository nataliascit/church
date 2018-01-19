package br.com.payment.management.core.repository;

import br.com.payment.management.core.configuration.BaseTestRunner;
import br.com.payment.management.core.entity.Campaign;
import br.com.payment.management.core.enumerable.ConfigurationCatalog;
import br.com.payment.management.core.util.JSONUtil;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;

/**
 * Class responsible for executing unit tests for {@link CampaignJpaRepository}.
 *
 * @author wcustodio
 */
@Transactional
public class CampaignJpaRepositoryTest extends BaseTestRunner {

    /**
     * Expected results used by the unit tests.
     */
    private static final int EXPECTED_NUMBER_OF_CAMPAIGNS = 2;

    /**
     * Constants used as parameters by the unit tests.
     */
    private static final Long TITHE_ID = 1L;

    @Autowired
    private CampaignJpaRepository campaignJpaRepository;

    /**
     * Search for a certain campaign by its id.
     */
    @Test
    public void testFindById() {
        final Campaign entity = this.campaignJpaRepository.findOne(TITHE_ID);
        Assert.assertNotNull(entity);
        Assert.assertEquals(TITHE_ID, entity.getId());
    }

    /**
     * Test the search for all registered campaigns in database.
     */
    @Test
    public void testFindAll() {
        final List<Campaign> entities = this.campaignJpaRepository.findAll();
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_NUMBER_OF_CAMPAIGNS, entities.size());
        entities.forEach(entity -> Assert.assertNotNull(entity.getId()));
    }

    /**
     * Test the persistence of a new {@link Campaign} with valid information.
     */
    @Test
    @Rollback
    public void testSaveWithValidInformation() throws IOException {

        // Get the mocked information to be used as base.
        final Campaign campaign = (Campaign) JSONUtil.fileToBean(ConfigurationCatalog.CAMPAIGN_FILE_PATH.getValue(), TypeFactory.defaultInstance().constructType(Campaign.class));
        campaign.setId(null);

        // Performs the persistence of the new campaign.
        this.campaignJpaRepository.save(campaign);

        // Verifies if the number of campaigns were increased by 1.
        Assert.assertEquals(EXPECTED_NUMBER_OF_CAMPAIGNS + 1, this.campaignJpaRepository.findAll().size());
    }
}