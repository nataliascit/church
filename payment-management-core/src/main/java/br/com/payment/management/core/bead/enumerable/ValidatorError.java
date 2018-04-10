package br.com.payment.management.core.bead.enumerable;

/**
 * All the possible messages thrown by a {@link br.com.payment.management.core.contribution.service.ContributionServiceValidator}.
 *
 * @author williamcustodio
 */
public enum ValidatorError {

    BEAD_ASSOCIATION_EMPTY("application.contribution.messages.bead.empty",
            "There is no bead for the current contribution with id %s.");

    private String key;

    private String message;

    ValidatorError(final String key, final String message) {
        this.key = key;
        this.message = message;
    }

    public String getKey() {
        return key;
    }

    public String getMessage() {
        return message;
    }
}
