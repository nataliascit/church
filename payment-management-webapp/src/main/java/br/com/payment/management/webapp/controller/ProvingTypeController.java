package br.com.payment.management.webapp.controller;

import br.com.payment.management.core.entity.ProvingType;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * {@link ProvingType} Data Access Object.
 *
 * @author wcustodio.
 */
public interface ProvingTypeController extends PagingAndSortingRepository<ProvingType, Long> {}