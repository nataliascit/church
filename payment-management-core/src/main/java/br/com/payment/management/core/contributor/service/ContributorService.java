package br.com.payment.management.core.contributor.service;

import br.com.payment.management.core.bead.repository.BeadRepository;
import br.com.payment.management.core.contribution.repository.ContributionRepository;
import br.com.payment.management.core.contributor.model.Contributor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Service responsible for handling processes related to a {@link br.com.payment.management.core.contributor.model.Contributor}.
 *
 * @author williamcustodio
 */
@Service
@Transactional
public class ContributorService {

    @Autowired
    private BeadRepository beadRepository;

    @Autowired
    private ContributionRepository contributionRepository;

    /**
     * Delete all associations of a contributor.
     * @param contributor The contributor to be deleted.
     */
    public void deleteAssociations(final Contributor contributor) {
        this.beadRepository.delete(contributor.getBeads());
        this.contributionRepository.delete(contributor.getContributions());
    }
}
