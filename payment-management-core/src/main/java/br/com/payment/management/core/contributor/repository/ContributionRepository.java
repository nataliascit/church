package br.com.payment.management.core.contributor.repository;

import br.com.payment.management.core.contribution.model.Contribution;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@link Contribution} Data Access Object.
 *
 * @author wcustodio
 */
public interface ContributionRepository extends JpaRepository<Contribution, Long> {
}
