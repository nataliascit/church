package br.com.payment.management.core.contribution.service;

import br.com.payment.management.core.bead.enumerable.ValidatorError;
import br.com.payment.management.core.bead.repository.BeadRepository;
import br.com.payment.management.core.campaign.model.Campaign;
import br.com.payment.management.core.common.exception.BusinessException;
import br.com.payment.management.core.contribution.model.Contribution;
import br.com.payment.management.core.contributor.model.Contributor;
import br.com.payment.management.core.provingType.enumerable.ProvingTypeCatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Service responsible for performing validations over a {@link Contribution}
 *
 * @author williamcustodio
 */
@Service
@Transactional
public class ContributionServiceValidator {

    @Autowired
    private BeadRepository beadRepository;

    /**
     * Performs validations before creating a contribution.
     * @param contribution The contribution to be validated.
     */
    public void validateBeforeCreate(final Contribution contribution) {
        if(isBeadAssociationNotFound(contribution.getCampaign(), contribution.getContributor())) {
            final String error = String.format(ValidatorError.BEAD_ASSOCIATION_EMPTY.getMessage(), contribution.getId());
            throw new BusinessException(ValidatorError.BEAD_ASSOCIATION_EMPTY.getKey(), error);
        }
    }

    /**
     * Verifies whether a contribution has or not a bead associated to it.
     * @param campaign The campaign which the bead will be associated.
     * @param contributor The contributor owner of the contribution.
     * @return <code>true</code>: Does not have a bead. </br>
     *         <code>false</code>: Does have a bead.
     */
    private boolean isBeadAssociationNotFound(final Campaign campaign, final Contributor contributor) {
        return ProvingTypeCatalog.TLO.name().equals(campaign.getProvingType().getMnemonic())
                && this.beadRepository.findByCampaign_IdAndContributor_Id(campaign.getId(), contributor.getId()) == null;
    }
}