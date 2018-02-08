package br.com.payment.management.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Class responsible for setting up the application.
 *
 * @author wcustodio
 */
@SpringBootApplication(scanBasePackages = {
    "br.com.payment.management.core",
    "br.com.payment.management.security",
    "br.com.payment.management.webapp"
})
@EntityScan(basePackages = {
    "br.com.payment.management.core",
    "br.com.payment.management.security"
})
@EnableJpaRepositories(basePackages = {
    "br.com.payment.management.core",
    "br.com.payment.management.security"
})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}