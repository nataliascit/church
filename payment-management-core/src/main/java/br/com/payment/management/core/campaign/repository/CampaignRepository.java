package br.com.payment.management.core.campaign.repository;

import br.com.payment.management.core.campaign.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * {@link Campaign} Data Access Object.
 *
 * @author William Custodio
 */
public interface CampaignRepository extends JpaRepository<Campaign, Long> {

    /**
     * Find all campaigns by its name.
     * @param name The name of the campaigns to be searched.
     * @return The found list of {@link Campaign}.
     */
    @Query("select e from Campaign e where :name is null or upper(e.name) like concat('%',upper(:name),'%')")
    List<Campaign> findAll(@Param("name") String name);
}