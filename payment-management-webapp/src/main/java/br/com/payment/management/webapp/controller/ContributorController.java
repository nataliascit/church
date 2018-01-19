package br.com.payment.management.webapp.controller;

import br.com.payment.management.core.entity.Contributor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * {@link Contributor} Data Access Object.
 *
 * @author wcustodio.
 */
public interface ContributorController extends PagingAndSortingRepository<Contributor, Long> {}