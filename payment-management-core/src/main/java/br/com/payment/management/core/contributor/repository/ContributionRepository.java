package br.com.payment.management.core.contributor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

import br.com.payment.management.core.contribution.model.Contribution;

/**
 * {@link Contribution} Data Access Object.
 *
 * @author wcustodio
 */
@PreAuthorize("hasRole('ADMIN')")
public interface ContributionRepository extends JpaRepository<Contribution, Long> {
}
