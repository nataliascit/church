package br.com.payment.management.core.repository;

import br.com.payment.management.core.entity.ProvingType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@link ProvingType} Data Access Object.
 *
 * @author wcustodio
 */
public interface ProvingTypeJpaRepository extends JpaRepository<ProvingType, Long> {
}