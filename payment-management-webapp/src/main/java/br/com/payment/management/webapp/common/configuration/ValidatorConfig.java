package br.com.payment.management.webapp.common.configuration;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Class responsible for enabling the hibernate validation for the rest layer.
 *
 * @author wcustodio
 */
@Configuration
public class ValidatorConfig extends RepositoryRestConfigurerAdapter implements InitializingBean {

    @Autowired
    private ValidatingRepositoryEventListener validatingRepositoryEventListener;

    @Autowired
    private Map<String, Validator> validators;

    @Bean
    public Validator validator() {
        return new LocalValidatorFactoryBean();
    }

    /**
     * Defines what are the validators used by all events.
     * @param validatingListener The list of possible events associated to the repositories.
     */
    @Override
    public void configureValidatingRepositoryEventListener(final ValidatingRepositoryEventListener validatingListener) {
        validatingListener.addValidator("afterCreate", validator());
        validatingListener.addValidator("beforeCreate", validator());
        validatingListener.addValidator("afterSave", validator());
        validatingListener.addValidator("beforeSave", validator());
    }

    @Override
    public void afterPropertiesSet() {
        final List<String> events = Collections.singletonList("beforeCreate");
        for (final Map.Entry<String, Validator> entry : validators.entrySet()) {
            events.stream().filter(p -> entry.getKey().startsWith(p)).findFirst().ifPresent(p -> validatingRepositoryEventListener.addValidator(p, entry.getValue()));
        }
    }
}