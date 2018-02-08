package br.com.payment.management.core.provingType.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

import br.com.payment.management.core.provingType.model.ProvingType;

/**
 * {@link ProvingType} Data Access Object.
 *
 * @author wcustodio
 */
@PreAuthorize("hasRole('ADMIN')")
public interface ProvingTypeRepository extends JpaRepository<ProvingType, Long> {
}