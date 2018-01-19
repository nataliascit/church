package br.com.payment.management.webapp.repository;

import br.com.payment.management.core.entity.ProvingType;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * {@link ProvingType} Data Access Object.
 *
 * @author wcustodio.
 */
public interface ProvingTypeRestRepository extends PagingAndSortingRepository<ProvingType, Long> {}