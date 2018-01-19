package br.com.payment.management.core.repository;

import br.com.payment.management.core.configuration.BaseTestRunner;
import br.com.payment.management.core.entity.Contributor;
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
 * Class responsible for executing unit tests for {@link ContributorJpaRepository}.
 *
 * @author wcustodio.
 */
@Transactional
public class ContributorJpaRepositoryTest extends BaseTestRunner {

    /**
     * Expected results used by the unit tests.
     */
    private static final int EXPECTED_NUMBER_OF_CONTRIBUTORS = 1;

    @Autowired
    private ContributorJpaRepository contributorJpaRepository;

    /**
     * Test the search for all registered contributors in database.
     */
    @Test
    public void testFindAll() {
        final List<Contributor> entities = this.contributorJpaRepository.findAll();
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_NUMBER_OF_CONTRIBUTORS, entities.size());
        entities.forEach(entity -> Assert.assertNotNull(entity.getId()));
    }

    /**
     * Test the persistence of a new {@link Contributor} with valid information.
     */
    @Test
    @Rollback
    public void testSaveWithValidInformation() throws IOException {

        // Get the mocked information to be used as base.
        final Contributor contributor = (Contributor) JSONUtil.fileToBean(ConfigurationCatalog.CONTRIBUTOR_FILE_PATH.getValue(), TypeFactory.defaultInstance().constructType(Contributor.class));
        contributor.setId(null);

        // Performs the persistence of the new contributor.
        this.contributorJpaRepository.save(contributor);

        // Verifies if the number of contributors were increased by 1.
        Assert.assertEquals(EXPECTED_NUMBER_OF_CONTRIBUTORS + 1, this.contributorJpaRepository.findAll().size());
    }
}