package br.com.payment.management.core.contributor.repository;

import br.com.payment.management.core.contributor.model.Contributor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * {@link Contributor} Data Access Object.
 *
 * @author William Custodio
 */
public interface ContributorRepository extends JpaRepository<Contributor, Long> {

    /**
     * Find all contributors by its name.
     * @param name The name of the contributors to be searched.
     * @return The found list of {@link Contributor}.
     */
    @Query("select e from Contributor e where :name is null or upper(e.name) like concat('%',upper(:name),'%')")
    List<Contributor> findAll(@Param("name") String name);
}