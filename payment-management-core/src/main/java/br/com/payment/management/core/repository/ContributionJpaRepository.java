package br.com.payment.management.core.repository;

import br.com.payment.management.core.entity.Contribution;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@link Contribution} Data Access Object.
 *
 * @author wcustodio
 */
public interface ContributionJpaRepository extends JpaRepository<Contribution, Long> {}
