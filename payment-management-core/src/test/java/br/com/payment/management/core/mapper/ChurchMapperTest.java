package br.com.payment.management.core.mapper;

import br.com.payment.management.core.bean.ChurchTO;
import br.com.payment.management.core.entity.Church;
import br.com.payment.management.core.enumerable.ConfigurationCatalog;
import br.com.payment.management.core.util.JSONUtil;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Test;

import java.io.IOException;

/**
 * Class responsible for executing unit tests for {@link ChurchMapper}.
 *
 * @author wcustodio
 */
public class ChurchMapperTest {

    @Test
    public void testChurchToChurchTO() throws IOException {
        final Church church = (Church) JSONUtil.fileToBean(ConfigurationCatalog.CHURCH_FILE_PATH.getValue(), TypeFactory.defaultInstance().constructType(Church.class));
        final ChurchTO churchTO = ChurchMapper.MAPPER.churchToChurchTO(church);
    }
}
