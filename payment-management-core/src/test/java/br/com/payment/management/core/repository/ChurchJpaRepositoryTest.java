package br.com.payment.management.core.repository;

import br.com.payment.management.core.configuration.BaseTestRunner;
import br.com.payment.management.core.entity.Church;
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
 * Class responsible for executing unit tests for {@link ChurchJpaRepository}.
 *
 * @author wcustodio
 */
@Transactional
public class ChurchJpaRepositoryTest extends BaseTestRunner {

    /**
     * Expected results used by the unit tests.
     */
    private static final int EXPECTED_NUMBER_OF_CHURCHS = 1;

    /**
     * Constants used as parameters by the unit tests.
     */
    private static final Long SAO_JOAQUIM_ID = 1L;

    @Autowired
    private ChurchJpaRepository churchJpaRepository;

    /**
     * Search for a certain church by its id.
     */
    @Test
    public void testFindById() {
        final Church entity = this.churchJpaRepository.findOne(SAO_JOAQUIM_ID);
        Assert.assertNotNull(entity);
        Assert.assertEquals(SAO_JOAQUIM_ID, entity.getId());
    }

    /**
     * Test the search for all registered churchs in database.
     */
    @Test
    public void testFindAll() {
        final List<Church> entities = this.churchJpaRepository.findAll();
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_NUMBER_OF_CHURCHS, entities.size());
        entities.forEach(entity -> Assert.assertNotNull(entity.getId()));
    }

    /**
     * Test the persistence of a new {@link Church} with valid information.
     */
    @Test
    @Rollback
    public void testSaveWithValidInformation() throws IOException {

        // Get the mocked information to be used as base.
        final Church church = (Church) JSONUtil.fileToBean(ConfigurationCatalog.CHURCH_FILE_PATH.getValue(), TypeFactory.defaultInstance().constructType(Church.class));
        church.setId(null);

        // Performs the persistence of the new church.
        this.churchJpaRepository.save(church);

        // Verifies if the number of churchs were increased by 1.
        Assert.assertEquals(EXPECTED_NUMBER_OF_CHURCHS + 1, this.churchJpaRepository.findAll().size());
    }
}