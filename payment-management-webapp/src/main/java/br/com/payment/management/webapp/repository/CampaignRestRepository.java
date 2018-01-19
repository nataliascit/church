package br.com.payment.management.webapp.repository;

import br.com.payment.management.core.entity.Campaign;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository responsible for mapping the entry points for a {@link Campaign}.
 *
 * @author wcustodio
 */
public interface CampaignRestRepository extends PagingAndSortingRepository<Campaign, Long> {}
