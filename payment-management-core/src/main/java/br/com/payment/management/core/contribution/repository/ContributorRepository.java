package br.com.payment.management.core.contribution.repository;

import br.com.payment.management.core.contributor.model.Contributor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@link Contributor} Data Access Object.
 *
 * @author wcustodio
 */
public interface ContributorRepository extends JpaRepository<Contributor, Long> {
}