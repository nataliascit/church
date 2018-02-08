package br.com.payment.management.core.bead.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

import br.com.payment.management.core.bead.model.Bead;

/**
 * {@link Bead} Data Access Object.
 *
 * @author wcustodio
 */
@PreAuthorize("hasRole('ADMIN')")
public interface BeadRepository extends JpaRepository<Bead, Long> {
}
