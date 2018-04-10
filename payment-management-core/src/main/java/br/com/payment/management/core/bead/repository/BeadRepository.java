package br.com.payment.management.core.bead.repository;

import br.com.payment.management.core.bead.model.Bead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * {@link Bead} Data Access Object.
 *
 * @author William Custodio
 */
public interface BeadRepository extends JpaRepository<Bead, Long> {

    /**
     * Find a certain bead by a contributor name and a campaign.
     * @param campaignId The campaign identifier.
     * @param contributorId The contributor identifier.
     * @return The found bead.
     */
    Bead findByCampaign_IdAndContributor_Id(@Param("campaignId") Long campaignId, @Param("contributorId") Long contributorId);
}
