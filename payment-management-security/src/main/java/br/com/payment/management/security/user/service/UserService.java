package br.com.payment.management.security.user.service;

import br.com.payment.management.security.user.model.User;

/**
 * Interface responsible for defining all possible services related to a {@link User}.
 *
 * @author wcustodio
 */
public interface UserService {

    /**
     * Persists a user into database.
     * @param user The representation of the user.
     * @return The persisted user.
     */
    User save(User user);

    /**
     * Updates a user into database.
     * @param user The representation of the user.
     * @return The persisted user.
     */
    User update(User user);

    /**
     * Delete a certain user by its identifier.
     * @param id The user's identifier.
     */
    void deleteById(Long id);

    /**
     * Find a certain user by its identifier.
     * @param id The user's identifier.
     * @return The found user.
     */
    User findById(Long id);

    /**
     * Delete a certain user by its username.
     * @param username The user's identifier.
     * @return The found user.
     */
    User findByUsername(String username);
}
