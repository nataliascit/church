package br.com.payment.management.core.repository;

import br.com.payment.management.core.entity.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@link Campaign} Data Access Object.
 *
 * @author wcustodio
 */
public interface CampaignJpaRepository extends JpaRepository<Campaign, Long> {}
