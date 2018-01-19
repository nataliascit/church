package br.com.payment.management.webapp.common.configuration.event;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.validation.Validator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * If we call POST request which generates the beforeCreate event, our application will not
 * call validator because the event will not be discovered, due to this bug.
 *
 * @author wcustodio
 * @see <a href="https://jira.spring.io/browse/DATAREST-524">http://google.com</a>
 */
public class ValidatorEventRegister implements InitializingBean {

    @Autowired
    private ValidatingRepositoryEventListener validatingRepositoryEventListener;

    @Autowired
    private Map<String, Validator> validators;

    @Override
    public void afterPropertiesSet() throws Exception {
        final List<String> events = Arrays.asList("beforeCreate");
        for (Map.Entry<String, Validator> entry : validators.entrySet()) {
            events.stream()
                    .filter(p -> entry.getKey().startsWith(p)).findFirst().ifPresent(p -> validatingRepositoryEventListener.addValidator(p, entry.getValue()));
        }
    }
}
