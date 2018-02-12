package br.com.payment.management.core.campaign.service;

import br.com.payment.management.core.campaign.enumerable.CampaignValidationError;
import br.com.payment.management.core.campaign.model.Campaign;
import br.com.payment.management.core.common.exception.BusinessException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Service responsible for executing validations over the data of a {@link Campaign}.
 *
 * @author wcustodio
 */
@Service
@Transactional
public class CampaignServiceValidator {

    /**
     * Execute the validation before the deletion of a {@link Campaign} occurs.
     * @param campaign {@link Campaign} with the data of the campaign to be validated.
     * @throws BusinessException Error while executing some business validation.
     */
    public void validateBeforeDeletion(final Campaign campaign) throws BusinessException {
        if(this.isAnyContributionAssociated(campaign)) {
            final String message = String.format(CampaignValidationError.DELETION_ASSOCIATED_CONTRIBUTION.getMessage(), campaign.getId());
            throw new BusinessException(CampaignValidationError.DELETION_ASSOCIATED_CONTRIBUTION.getKey(), message);
        }
    }

    /**
     * Verifies if there is at least one contribution associated to a certain campaign.
     * @param campaign The Campaign to be validated.
     * @return <code>true</code>: There is at least one contribution associated to the campaign. </br>
     *         <code>true</code>: There is not any contribution associated to the campaign.
     */
    private boolean isAnyContributionAssociated(final Campaign campaign) {
        return campaign.getContributions() != null && !campaign.getContributions().isEmpty();
    }
}