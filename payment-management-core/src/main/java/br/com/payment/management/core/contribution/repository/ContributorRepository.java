package br.com.payment.management.core.contribution.repository;

import br.com.payment.management.core.contributor.model.Contributor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * {@link Contributor} Data Access Object.
 *
 * @author wcustodio
 */
@PreAuthorize("hasRole('ROLE_ADMIN')")
public interface ContributorRepository extends JpaRepository<Contributor, Long> {
}