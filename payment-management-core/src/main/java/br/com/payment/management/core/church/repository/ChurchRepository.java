package br.com.payment.management.core.church.repository;

import br.com.payment.management.core.church.model.Church;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * {@link Church} Data Access Object.
 *
 * @author wcustodio
 */
@PreAuthorize("hasRole('ROLE_ADMIN')")
public interface ChurchRepository extends JpaRepository<Church, Long> {
}
