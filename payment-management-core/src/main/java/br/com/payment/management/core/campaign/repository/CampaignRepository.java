package br.com.payment.management.core.campaign.repository;

import br.com.payment.management.core.campaign.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@link Campaign} Data Access Object.
 *
 * @author wcustodio
 */
public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}
