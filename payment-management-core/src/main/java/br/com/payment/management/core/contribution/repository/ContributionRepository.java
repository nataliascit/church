package br.com.payment.management.core.contribution.repository;

import br.com.payment.management.core.contribution.model.Contribution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

/**
 * {@link Contribution} Data Access Object.
 *
 * @author William Custodio
 */
public interface ContributionRepository extends JpaRepository<Contribution, Long> {

    /**
     * Find all contributions by the name of a contributor, campaign and the creation date.
     * @param campaignName The name of the campaign.
     * @param contributorName The name of the contributor.
     * @param beginCreationDate The beginning of a creation date range of the contribution.
     * @param endCreationDate The end of a creation date range of the contribution.
     * @return The found list of {@link Contribution}.
     */
    @Query("select e from Contribution e " +
            "where ( :campaignName is null or upper(e.campaign.name) like concat('%',upper(:campaignName),'%') ) " +
            "and ( :contributorName is null or upper(e.contributor.name) like concat('%',upper(:contributorName),'%') ) " +
            "and ( ( ( :beginCreationDate is not null and :endCreationDate is not null ) and ( e.creationDate between :beginCreationDate and :endCreationDate) ) " +
            " or ( ( :beginCreationDate is not null and :endCreationDate is null ) and e.creationDate >= :beginCreationDate ) " +
            " or ( ( :beginCreationDate is null and :endCreationDate is not null ) and e.creationDate <= :endCreationDate ) " +
            " or ( :beginCreationDate is null and :endCreationDate is null ) ) " +
            "order by e.creationDate desc")
    List<Contribution> findAll(
            @Param("campaignName") String campaignName,
            @Param("contributorName") String contributorName,
            @Param("beginCreationDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate beginCreationDate,
            @Param("endCreationDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endCreationDate
    );
}