package br.com.payment.management.security.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.payment.management.security.user.model.User;

/**
 * {@link User} Data Access Object.
 *
 * @author wcustodio
 */
@RepositoryRestResource(exported = false)
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Delete a certain user by its username.
     * @param username The user's identifier.
     * @return The found user.
     */
    User findByUsername(String username);
}