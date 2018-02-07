package br.com.payment.management.security.role.repository;

import br.com.payment.management.security.role.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * {@link Role} Data Access Object.
 *
 * @author wcustodio
 */
@RepositoryRestResource(exported = false)
public interface RoleRepository extends JpaRepository<Role, Long> {
}