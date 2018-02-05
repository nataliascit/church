package br.com.payment.management.core.contributor.repository;

import br.com.payment.management.core.contribution.model.Contribution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * {@link Contribution} Data Access Object.
 *
 * @author wcustodio
 */
@PreAuthorize("hasRole('ROLE_ADMIN')")
public interface ContributionRepository extends JpaRepository<Contribution, Long> {
}
