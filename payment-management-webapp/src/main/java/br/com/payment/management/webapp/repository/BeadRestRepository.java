package br.com.payment.management.webapp.repository;

import br.com.payment.management.core.entity.Bead;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository responsible for mapping the entry points for a {@link Bead}.
 *
 * @author wcustodio
 */
public interface BeadRestRepository extends PagingAndSortingRepository<Bead, Long> {
}
