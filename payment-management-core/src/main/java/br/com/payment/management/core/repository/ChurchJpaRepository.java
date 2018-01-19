package br.com.payment.management.core.repository;

import br.com.payment.management.core.entity.Church;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@link Church} Data Access Object.
 *
 * @author wcustodio
 */
public interface ChurchJpaRepository extends JpaRepository<Church, Long> {
}
