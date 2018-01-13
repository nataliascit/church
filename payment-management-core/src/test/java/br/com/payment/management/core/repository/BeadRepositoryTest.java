package br.com.payment.management.core.repository;

import br.com.payment.management.core.configuration.BaseTestRunner;
import br.com.payment.management.core.entity.Bead;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Class responsible for executing unit tests for {@link BeadRepository}.
 *
 * @author wcustodio.
 */
@Transactional
public class BeadRepositoryTest extends BaseTestRunner {

    /**
     * Expected results used by the unit tests.
     */
    private static final int EXPECTED_BEADS = 1;

    @Autowired
    private BeadRepository beadRepository;

    /**
     * Test the search for all registered beads in database.
     */
    @Test
    public void findAll() {
        final List<Bead> entities = this.beadRepository.findAll();
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_BEADS, entities.size());
        for (final Bead entity : entities) {
            Assert.assertNotNull(entity.getId());
        }
    }
}