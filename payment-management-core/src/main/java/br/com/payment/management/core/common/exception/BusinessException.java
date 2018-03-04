package br.com.payment.management.core.common.exception;

/**
 * Represents a business exception that ocurred while executing the application.
 *
 * @author wcustodio
 */
public class BusinessException extends RuntimeException {

    /**
     * Catalog of possible exception types that a business exception can assume.
     */
    public enum Type {
        INFO, WARNING, ERROR
    }

    /**
     * The key used as an unique identifier for the error message.
     */
    private final String key;

    /**
     * The internal message that will be shown on the console.
     */
    private final String message;

    /**
     * The representation of the {@link Type} assumed by the current exception.
     */
    private final Type type;

    public BusinessException(final String key, final String message) {
        this(key, message, Type.ERROR);
    }

    public BusinessException(final String key, final String message,  final Type type) {
        super(message);
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

    public Type getType() {
        return type;
    }
}
