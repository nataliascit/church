package br.com.payment.management.webapp.validator;

import br.com.payment.management.core.entity.Church;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Validator responsible for performing custom validations over a {@link Church}.
 *
 * @author wcustodio
 */
@Component("beforeCreateChurchValidator")
public class BeforeCreateChurchValidator implements Validator {

    @Override
    public boolean supports(final Class<?> clazz) {
        return Church.class.equals(clazz);
    }

    @Override
    public void validate(final Object target, final Errors errors) {
    }
}