package br.com.payment.management.security.common.exception;

import br.com.payment.management.security.common.enumerable.ErrorType;

import java.util.Map;

/**
 * Represents an exception that occurred while execution business validations.
 *
 * @author wcustodio
 */
public class BusinessValidationException extends BusinessException {

    /**
     * The definition of the error severity.
     */
    private final ErrorType errorType;

    public BusinessValidationException(final Throwable throwable, final ErrorType errorType, final String key, final String message, final Map<String, String> parameters) {
        super(throwable, key, message, parameters);
        this.errorType = errorType;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}
