package br.com.payment.management.core.repository;

import br.com.payment.management.core.configuration.BaseTestRunner;
import br.com.payment.management.core.entity.Contributor;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Class responsible for executing unit tests for {@link ContributorRepository}.
 *
 * @author wcustodio.
 */
@Transactional
public class ContributorRepositoryTest extends BaseTestRunner {

    /**
     * Expected results used by the unit tests.
     */
    private static final int EXPECTED_CONTRIBUTORS = 1;

    @Autowired
    private ContributorRepository contributorRepository;

    /**
     * Test the search for all registered contributors in database.
     */
    @Test
    public void findAll() {
        final List<Contributor> entities = this.contributorRepository.findAll();
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_CONTRIBUTORS, entities.size());
        entities.forEach(entity -> Assert.assertNotNull(entity.getId()));
    }
}