package br.com.payment.management.core.configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Class responsible for setting up the unit tests context.
 *
 * @author wcustodio
 */
@Configuration
@SpringBootApplication
@ComponentScan(basePackages = {"br.com.payment.management.core"})
@EnableJpaRepositories("br.com.payment.management.core.repository")
@EntityScan(basePackages = {"br.com.payment.management.core.entity"}, basePackageClasses = {Jsr310JpaConverters.class})
public class TestRootConfig {
}