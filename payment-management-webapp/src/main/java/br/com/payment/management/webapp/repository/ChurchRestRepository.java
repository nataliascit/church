package br.com.payment.management.webapp.repository;

import br.com.payment.management.core.entity.Church;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository responsible for mapping the entry points for a {@link Church}.
 *
 * @author wcustodio
 */
public interface ChurchRestRepository extends PagingAndSortingRepository<Church, Long> {
}
