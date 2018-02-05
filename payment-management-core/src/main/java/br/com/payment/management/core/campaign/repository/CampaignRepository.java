package br.com.payment.management.core.campaign.repository;

import br.com.payment.management.core.campaign.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * {@link Campaign} Data Access Object.
 *
 * @author wcustodio
 */
@PreAuthorize("hasRole('ROLE_ADMIN')")
public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}
