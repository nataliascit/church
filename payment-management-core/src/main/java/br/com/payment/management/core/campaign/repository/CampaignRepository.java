package br.com.payment.management.core.campaign.repository;

import br.com.payment.management.core.campaign.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@link Campaign} Data Access Object.
 *
 * @author William Custodio
 */
public interface CampaignRepository extends JpaRepository<Campaign, Long> {

    /**
     * Find a specific campaign by its name.
     * @param name The name of the campaign to be searched.
     * @return The found {@link Campaign}.
     */
    Campaign findByName(String name);
}
