package br.com.payment.management.core.contribution.repository;

import br.com.payment.management.core.contribution.model.Contribution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * {@link Contribution} Data Access Object.
 *
 * @author William Custodio
 */
public interface ContributionRepository extends JpaRepository<Contribution, Long> {

    /**
     * Find all contribution by the name of a contributor, campaign and the creation date.
     * @param campaignName The name of the campaign.
     * @param contributorName The name of the contributor.
     * @param creationDate The creation date of the contribution.
     * @return The found list of {@link Contribution}.
     */
    @Query("select e from Contribution e " +
            "where ( :campaignName is null or upper(e.campaign.name) like concat('%',upper(:campaignName),'%') ) " +
            "and ( :contributorName is null or upper(e.contributor.name) like concat('%',upper(:contributorName),'%') ) " +
            "and ( :creationDate is null or e.creationDate = :creationDate )")
    List<Contribution> findAll(
            @Param("campaignName") String campaignName,
            @Param("contributorName") String contributorName,
            @Param("creationDate") String creationDate
    );
}