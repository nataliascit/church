package br.com.payment.management.core.bead.repository;

import br.com.payment.management.core.bead.model.Bead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * {@link Bead} Data Access Object.
 *
 * @author wcustodio
 */
@PreAuthorize("hasRole('ROLE_ADMIN')")
public interface BeadRepository extends JpaRepository<Bead, Long> {
}
