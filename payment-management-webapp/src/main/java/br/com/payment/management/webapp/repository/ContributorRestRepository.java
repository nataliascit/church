package br.com.payment.management.webapp.repository;

import br.com.payment.management.core.entity.Contributor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository responsible for mapping the entry points for a {@link Contributor}.
 *
 * @author wcustodio
 */
public interface ContributorRestRepository extends PagingAndSortingRepository<Contributor, Long> {}