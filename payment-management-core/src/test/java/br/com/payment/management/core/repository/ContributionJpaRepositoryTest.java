package br.com.payment.management.core.repository;

import br.com.payment.management.core.configuration.BaseTestRunner;
import br.com.payment.management.core.entity.Contribution;
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
 * Class responsible for executing unit tests for {@link ContributionJpaRepository}.
 *
 * @author wcustodio.
 */
@Transactional
public class ContributionJpaRepositoryTest extends BaseTestRunner {

    /**
     * Expected results used by the unit tests.
     */
    private static final int EXPECTED_NUMBER_OF_CONTRIBUTIONS = 2;

    @Autowired
    private ContributionJpaRepository contributionJpaRepository;

    /**
     * Test the search for all registered contributions in database.
     */
    @Test
    public void testFindAll() {
        final List<Contribution> entities = this.contributionJpaRepository.findAll();
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_NUMBER_OF_CONTRIBUTIONS, entities.size());
        entities.forEach(entity -> Assert.assertNotNull(entity.getId()));
    }

    /**
     * Test the persistence of a new {@link Contribution} with valid information.
     */
    @Test
    @Rollback
    public void testSaveWithValidInformation() throws IOException {

        // Get the mocked information to be used as base.
        final Contribution contribution = (Contribution) JSONUtil.fileToBean(ConfigurationCatalog.CONTRIBUTION_FILE_PATH.getValue(), TypeFactory.defaultInstance().constructType(Contribution.class));
        contribution.setId(null);

        // Performs the persistence of the new contribution.
        this.contributionJpaRepository.save(contribution);

        // Verifies if the number of contributions were increased by 1.
        Assert.assertEquals(EXPECTED_NUMBER_OF_CONTRIBUTIONS + 1, this.contributionJpaRepository.findAll().size());
    }
}