package br.com.payment.management.webapp.common.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The response used to represent an error that happened while processing some request.
 *
 * @author wcustodio
 */
public class ExceptionResponse {

    /**
     * Catalog of possible exception types that a business exception can assume.
     */
    public enum Type {
        INFO, WARNING, ERROR
    }

    /**
     * The http status that the current exception represents.
     */
    private final HttpStatus status;

    /**
     * The representation of the {@link Type} assumed by the current exception.
     */
    @JsonProperty
    private final Type type;

    /**
     * The timestamp representing when the error happened.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private final LocalDateTime timestamp;

    /**
     * The keys used as an unique identifier for the error messages.
     */
    private final List<String> keys = new ArrayList<>();

    /**
     * The internal message that will be shown on the console.
     */
    @JsonProperty
    private final String message;

    public ExceptionResponse(final Throwable exception, final String... keys) {
        this(exception, Type.ERROR, HttpStatus.BAD_REQUEST, keys);
    }

    public ExceptionResponse(final Throwable exception, final Type type, final HttpStatus status, final String... keys) {
        this(type, status, exception.getLocalizedMessage(), keys);
    }

    public ExceptionResponse(final Type type, final HttpStatus status, final String message, final String... keys) {
        this.type = type;
        this.status = status;
        this.message = message;
        this.keys.addAll(Arrays.asList(keys));
        this.timestamp = LocalDateTime.now();
    }

    public List<String> getKeys() {
        return keys;
    }

    public String getStatus() {
        return this.status.toString();
    }
}
