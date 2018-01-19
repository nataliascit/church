package br.com.payment.management.webapp.repository;

import br.com.payment.management.core.entity.Campaign;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * {@link Campaign} Data Access Object.
 *
 * @author wcustodio.
 */
public interface CampaignRestRepository extends PagingAndSortingRepository<Campaign, Long> {}
