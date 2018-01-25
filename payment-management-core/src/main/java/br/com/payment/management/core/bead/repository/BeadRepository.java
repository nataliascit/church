package br.com.payment.management.core.bead.repository;

import br.com.payment.management.core.bead.model.Bead;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@link Bead} Data Access Object.
 *
 * @author wcustodio
 */
public interface BeadRepository extends JpaRepository<Bead, Long> {
}
