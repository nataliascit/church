package br.com.payment.management.webapp.repository;

import br.com.payment.management.core.entity.ProvingType;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository responsible for mapping the entry points for a {@link ProvingType}.
 *
 * @author wcustodio
 */
public interface ProvingTypeRestRepository extends PagingAndSortingRepository<ProvingType, Long> {}