package br.com.payment.management.webapp.controller;

import br.com.payment.management.core.entity.Campaign;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * {@link Campaign} Data Access Object.
 *
 * @author wcustodio.
 */
public interface CampaignController extends PagingAndSortingRepository<Campaign, Long> {}
