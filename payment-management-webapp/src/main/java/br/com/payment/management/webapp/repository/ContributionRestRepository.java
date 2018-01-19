package br.com.payment.management.webapp.repository;

import br.com.payment.management.core.entity.Contribution;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository responsible for mapping the entry points for a {@link Contribution}.
 *
 * @author wcustodio
 */
public interface ContributionRestRepository extends PagingAndSortingRepository<Contribution, Long> {}
