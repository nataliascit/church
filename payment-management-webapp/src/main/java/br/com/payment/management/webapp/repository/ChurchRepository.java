package br.com.payment.management.webapp.repository;

import br.com.payment.management.core.entity.Church;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * {@link Church} Data Access Object.
 *
 * @author wcustodio.
 */
public interface ChurchRepository extends PagingAndSortingRepository<Church, Long> {}
