package br.com.payment.management.core.repository;

import br.com.payment.management.core.entity.Contributor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@link Contributor} Data Access Object.
 *
 * @author wcustodio
 */
public interface ContributorJpaRepository extends JpaRepository<Contributor, Long> {
}