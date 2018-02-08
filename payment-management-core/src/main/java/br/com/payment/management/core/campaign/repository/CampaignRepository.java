package br.com.payment.management.core.campaign.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

import br.com.payment.management.core.campaign.model.Campaign;

/**
 * {@link Campaign} Data Access Object.
 *
 * @author wcustodio
 */
@PreAuthorize("hasRole('ADMIN')")
public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}
