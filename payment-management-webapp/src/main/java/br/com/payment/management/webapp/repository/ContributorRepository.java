package br.com.payment.management.webapp.repository;

import br.com.payment.management.core.entity.Contributor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * {@link Contributor} Data Access Object.
 *
 * @author wcustodio.
 */
public interface ContributorRepository extends PagingAndSortingRepository<Contributor, Long> {}