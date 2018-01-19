package br.com.payment.management.webapp.repository;

import br.com.payment.management.core.entity.Contribution;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * {@link Contribution} Data Access Object.
 *
 * @author wcustodio.
 */
public interface ContributionRestRepository extends PagingAndSortingRepository<Contribution, Long> {}
