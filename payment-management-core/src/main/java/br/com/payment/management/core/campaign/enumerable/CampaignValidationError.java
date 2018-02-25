package br.com.payment.management.core.campaign.enumerable;

/**
 * Catalog of all possible error messages used by a {@link br.com.payment.management.core.campaign.service.CampaignServiceValidator}
 *
 * @author wcustodio
 */
public enum CampaignValidationError {

    DELETION_ASSOCIATED_CONTRIBUTION("application.campaign.messages.contribution.associated",
            "It is not possible to delete the campaign because there are contributions associated to it. [CAMPAIGN_ID]=%s");

    private String key;

    private String message;

    CampaignValidationError(final String key, final String message) {
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
