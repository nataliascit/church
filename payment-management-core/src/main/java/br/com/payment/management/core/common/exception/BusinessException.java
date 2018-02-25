package br.com.payment.management.core.common.exception;

/**
 * Represents a business exception that ocurred while executing the application.
 *
 * @author wcustodio
 */
public class BusinessException extends Exception {

    /**
     * Catalog of possible exception types that a business exception can assume.
     */
    public enum ExceptionType {
        INFO, WARN, ERROR;
    }

    /**
     * The key used as an unique identifier for the error message.
     */
    private final String key;

    /**
     * The internal message that will be shown on the console.
     */
    private final String message;

    private final ExceptionType type;

    public BusinessException(final String key, final String message) {
        this(key, message, ExceptionType.ERROR);
    }

    public BusinessException(final String key, final String message,  final ExceptionType type) {
        super(message);
        this.key = key;
        this.message = message;
        this.type = type;
    }

    public BusinessException(final Throwable cause, final String key, final String message) {
        this(cause, key, message, ExceptionType.ERROR);
    }

    public BusinessException(final Throwable cause, final String key, final String message, final ExceptionType type) {
        super(message, cause);
        this.key = key;
        this.message = message;
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public ExceptionType getType() {
        return type;
    }
}
