package br.com.payment.management.core.campaign.repository;

import br.com.payment.management.core.campaign.model.Campaign;
import br.com.payment.management.core.provingType.model.ProvingType;
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
    @Query("select e from Campaign e where :name is null " +
            "or upper(e.name) like concat('%',upper(:name),'%') " +
            "order by e.id desc")
    List<Campaign> findAll(@Param("name") String name);

    /**
     * Find all existing campaigns that has a certain type of {@link ProvingType}
     * and is not associated to a specific user.
     * @param contributorId The contributor identifier.
     * @param provingType The proving type mnemonic. Ex: TLO - Talão.
     * @return The list of found campaigns.
     */
    @Query("select e from Campaign e where e.provingType.mnemonic = :provingType and e.id not in ( " +
            "select c.id from Campaign c inner join c.beads b " +
            "where b.contributor.id = :contributorId " +
            "and c.provingType.mnemonic = :provingType ) " +
            "order by e.name asc")
    List<Campaign> findAllByProvingTypeAndNotAssociatedToUser(
            @Param("contributorId") Long contributorId,
            @Param("provingType") String provingType
    );

    /**
     * Find all existing campaigns that has a certain type.
     * @param provingType The proving type mnemonic. Ex: TLO - Talão.
     * @return The list of found campaigns.
     */
    @Query("select e from Campaign e where e.provingType.mnemonic = :provingType order by e.name asc")
    List<Campaign> findAllByProvingType(@Param("provingType") String provingType);
}