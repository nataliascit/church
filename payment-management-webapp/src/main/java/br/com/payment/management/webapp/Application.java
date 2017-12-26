package br.com.payment.management.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Class responsible for setting up the application.
 *
 * @author wcustodio
 */
@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@ComponentScan("br.com.payment.management")
@EnableJpaRepositories(basePackages = {"br.com.payment.management.core.repository"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}