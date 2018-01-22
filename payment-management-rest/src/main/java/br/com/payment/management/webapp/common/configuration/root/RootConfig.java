package br.com.payment.management.webapp.common.configuration.root;

import br.com.payment.management.webapp.common.configuration.event.ValidatorEventRegister;
import br.com.payment.management.webapp.common.configuration.persistence.DataBaseConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Class responsible for setting up the application context.
 *
 * @author wcustodio
 */
@Configuration
@Import({DataBaseConfig.class, ValidatorEventRegister.class})
public class RootConfig {
}