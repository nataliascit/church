package br.com.payment.management.core.church.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

import br.com.payment.management.core.church.model.Church;

/**
 * {@link Church} Data Access Object.
 *
 * @author wcustodio
 */
@PreAuthorize("hasRole('ADMIN')")
public interface ChurchRepository extends JpaRepository<Church, Long> {
}
