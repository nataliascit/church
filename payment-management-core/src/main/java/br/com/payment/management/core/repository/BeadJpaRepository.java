package br.com.payment.management.core.repository;

import br.com.payment.management.core.entity.Bead;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@link Bead} Data Access Object.
 *
 * @author wcustodio
 */
public interface BeadJpaRepository extends JpaRepository<Bead, Long> {}
