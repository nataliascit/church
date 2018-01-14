package br.com.payment.management.core.repository;

import br.com.payment.management.core.configuration.BaseTestRunner;
import br.com.payment.management.core.entity.Church;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Class responsible for executing unit tests for {@link ChurchRepository}.
 *
 * @author wcustodio.
 */
@Transactional
public class ChurchRepositoryTest extends BaseTestRunner {

    /**
     * Expected results used by the unit tests.
     */
    private static final int EXPECTED_CHURCHS = 1;

    /**
     * Constants used as parameters by the unit tests.
     */
    private static final Long SAO_JOAQUIM_ID = 1L;

    @Autowired
    private ChurchRepository churchRepository;

    /**
     * Search for a certain church by its id.
     */
    @Test
    public void findById() {
        final Church entity = this.churchRepository.findOne(SAO_JOAQUIM_ID);
        Assert.assertNotNull(entity);
        Assert.assertEquals(SAO_JOAQUIM_ID, entity.getId());
    }

    /**
     * Test the search for all registered churchs in database.
     */
    @Test
    public void findAll() {
        final List<Church> entities = this.churchRepository.findAll();
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_CHURCHS, entities.size());
        entities.forEach(entity -> Assert.assertNotNull(entity.getId()));
    }
}