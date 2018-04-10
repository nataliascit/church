package br.com.payment.management.core.bead.service;

import br.com.payment.management.core.bead.model.Bead;
import br.com.payment.management.core.bead.repository.BeadRepository;
import br.com.payment.management.core.campaign.model.Campaign;
import br.com.payment.management.core.contribution.model.Contribution;
import br.com.payment.management.core.contribution.repository.ContributionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Service responsible for handling processes related to a {@link br.com.payment.management.core.bead.model.Bead}.
 *
 * @author williamcustodio
 */
@Service
@Transactional
public class BeadService {

    @Autowired
    private ContributionRepository contributionRepository;

    /**
     * Delete all associations of a bead.
     * @param bead The bead to be deleted.
     */
    public void deleteAssociations(final Bead bead) {
        this.contributionRepository.delete(bead.getContributions());
    }
}
