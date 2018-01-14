package br.com.payment.management.core.repository;

import br.com.payment.management.core.configuration.BaseTestRunner;
import br.com.payment.management.core.entity.Campaign;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Class responsible for executing unit tests for {@link CampaignRepository}.
 *
 * @author wcustodio.
 */
@Transactional
public class CampaignRepositoryTest extends BaseTestRunner {

    /**
     * Expected results used by the unit tests.
     */
    private static final int EXPECTED_CAMPAIGNS = 2;

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
    public void findById() {
        final Campaign entity = this.campaignRepository.findOne(TITHE_ID);
        Assert.assertNotNull(entity);
        Assert.assertEquals(TITHE_ID, entity.getId());
    }

    /**
     * Test the search for all registered campaigns in database.
     */
    @Test
    public void findAll() {
        final List<Campaign> entities = this.campaignRepository.findAll();
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_CAMPAIGNS, entities.size());
        for (final Campaign entity : entities) {
            Assert.assertNotNull(entity.getId());
        }
    }
}