package br.com.payment.management.core.campaign.repository;

import br.com.payment.management.core.campaign.repository.CampaignRepository;
import br.com.payment.management.core.common.configuration.BaseTestRunner;
import br.com.payment.management.core.campaign.model.Campaign;
import br.com.payment.management.core.common.enumerable.ConfigurationCatalog;
import br.com.payment.management.core.common.util.JSONUtil;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

/**
 * Class responsible for executing unit tests for {@link CampaignRepository}.
 *
 * @author wcustodio
 */
@Transactional
public class CampaignRepositoryTest extends BaseTestRunner {

    /**
     * Expected results used by the unit tests.
     */
    private static final int EXPECTED_NUMBER_OF_CAMPAIGNS = 2;

    /**
     * Constants used as parameters by the unit tests.
     */
    private static final Long TITHE_ID = 1L;

    @Autowired
    private CampaignRepository campaignRepository;

    /**
     * Search for a certain campaign by its id.
     */
    @Test
    public void testFindById() {
        final Campaign entity = this.campaignRepository.findOne(TITHE_ID);
        Assert.assertNotNull(entity);
        Assert.assertEquals(TITHE_ID, entity.getId());
    }

    /**
     * Test the search for all registered campaigns in database.
     */
    @Test
    public void testFindAll() {

        final List<Campaign> entities = this.campaignRepository.findAll();
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_NUMBER_OF_CAMPAIGNS, entities.size());

        entities.forEach(entity -> {
            Assert.assertNotNull(entity.getId());
            Assert.assertNotNull(entity.getChurch());
            Assert.assertNotNull(entity.getProvingType());
            Assert.assertNotNull(entity.getContributions());
            Assert.assertFalse(entity.getContributions().isEmpty());
        });
    }

    /**
     * Test the persistence of a new {@link Campaign} with valid information.
     */
    @Test
    @Rollback
    public void testSaveWithValidInformation() throws IOException {
        // Get the mocked information to be used as base.
        final Campaign campaign = (Campaign) JSONUtil.fileToBean(ConfigurationCatalog.CAMPAIGN_FILE_PATH.getValue(), TypeFactory.defaultInstance().constructType(Campaign.class));
        // Performs the persistence of the new campaign.
        this.campaignRepository.save(campaign);
        // Verifies if the number of campaigns were increased by 1.
        Assert.assertEquals(EXPECTED_NUMBER_OF_CAMPAIGNS + 1, this.campaignRepository.findAll().size());
    }

    /**
     * Test the deletion of a existing {@link Campaign} with valid information.
     */
    @Test
    @Rollback
    public void testDeleteWithValidInformation() {
        // Get the entity to be deleted.
        final List<Campaign> entities = this.campaignRepository.findAll();
        final Optional<Campaign> entity = entities.stream().findFirst();
        Assert.assertTrue(entity.isPresent());
        // Performs the deletion of the new campaign.
        this.campaignRepository.delete(entity.get());
        // Verifies if the number of entities were decreased by 1.
        Assert.assertEquals(EXPECTED_NUMBER_OF_CAMPAIGNS - 1, this.campaignRepository.findAll().size());
    }
}