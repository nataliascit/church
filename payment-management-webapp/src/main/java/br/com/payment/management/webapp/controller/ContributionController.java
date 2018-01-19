package br.com.payment.management.webapp.controller;

import br.com.payment.management.core.entity.Contribution;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * {@link Contribution} Data Access Object.
 *
 * @author wcustodio.
 */
public interface ContributionController extends PagingAndSortingRepository<Contribution, Long> {}
