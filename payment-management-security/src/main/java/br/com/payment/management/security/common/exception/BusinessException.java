package br.com.payment.management.security.common.exception;

import java.util.Map;

/**
 * Represents a business exception that occurred inside the application.
 *
 * @author wcustodio
 */
public class BusinessException extends Exception {

    /**
     * Represents the key to be translated on the front-end.
     */
    private final String key;

    /**
     * Represents the parameters to be inserted in the front-end message.
     */
    private final Map<String, String> parameters;

    /**
     * Represents the internal message to be used on the stacktrace.
     */
    private final String message;

    public BusinessException(final Throwable throwable, final String key, final String message, final Map<String, String> parameters) {
        super(message, throwable);
        this.key = key;
        this.message = message;
        this.parameters = parameters;
    }

    public String getKey() {
        return key;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
