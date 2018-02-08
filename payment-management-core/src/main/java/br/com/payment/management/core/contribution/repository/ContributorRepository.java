package br.com.payment.management.core.contribution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

import br.com.payment.management.core.contributor.model.Contributor;

/**
 * {@link Contributor} Data Access Object.
 *
 * @author wcustodio
 */
@PreAuthorize("hasRole('ADMIN')")
public interface ContributorRepository extends JpaRepository<Contributor, Long> {
}