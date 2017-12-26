package br.com.payment.management.webapp.common.configuration.root;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import br.com.payment.management.webapp.common.configuration.persistence.DataBaseConfig;

/**
 * Class responsible for setting up the application context.
 *
 * @author wcustodio.
 */
@Configuration
@Import({DataBaseConfig.class})
public class RootConfig {
}