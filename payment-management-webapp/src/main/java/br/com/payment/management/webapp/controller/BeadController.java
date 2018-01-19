package br.com.payment.management.webapp.controller;

import br.com.payment.management.core.entity.Bead;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * {@link Bead} Data Access Object.
 *
 * @author wcustodio.
 */
public interface BeadController extends PagingAndSortingRepository<Bead, Long> {}
