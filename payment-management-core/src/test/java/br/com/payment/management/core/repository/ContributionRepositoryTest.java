package br.com.payment.management.core.repository;

import br.com.payment.management.core.configuration.BaseTestRunner;
import br.com.payment.management.core.entity.Contribution;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Class responsible for executing unit tests for {@link ContributionRepository}.
 *
 * @author wcustodio.
 */
@Transactional
public class ContributionRepositoryTest extends BaseTestRunner {

    /**
     * Expected results used by the unit tests.
     */
    private static final int EXPECTED_CONTRIBUTIONS = 2;

    @Autowired
    private ContributionRepository contributionRepository;

    /**
     * Test the search for all registered contributions in database.
     */
    @Test
    public void findAll() {
        final List<Contribution> entities = this.contributionRepository.findAll();
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_CONTRIBUTIONS, entities.size());
        entities.forEach(entity -> Assert.assertNotNull(entity.getId()));
    }
}