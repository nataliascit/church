package br.com.payment.management.core.provingType.repository;

import br.com.payment.management.core.provingType.model.ProvingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * {@link ProvingType} Data Access Object.
 *
 * @author wcustodio
 */
@PreAuthorize("hasRole('ROLE_ADMIN')")
public interface ProvingTypeRepository extends JpaRepository<ProvingType, Long> {
}