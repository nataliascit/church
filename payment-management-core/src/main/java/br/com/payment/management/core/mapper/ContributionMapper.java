package br.com.payment.management.core.mapper;

import br.com.payment.management.core.bean.ContributionTO;
import br.com.payment.management.core.entity.Contribution;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * Mapper responsible for mapping values from a {@link Contribution} to a {@link ContributionTO} and vice-versa.
 *
 * @author wcustodio
 */
@Mapper
public interface ContributionMapper {

    @Mappings({
            @Mapping(target="id", source="entity.id"),
            @Mapping(target="creationDate", source="entity.creationDate"),
            @Mapping(target="amount", source="entity.amount"),
            @Mapping(target="campaign", ignore = true),
            @Mapping(target="contributor", ignore = true)
    })
    ContributionTO contributionToContributionTO(Contribution entity);

    @Mappings({
            @Mapping(target="id", source="to.id"),
            @Mapping(target="creationDate", source="to.creationDate"),
            @Mapping(target="amount", source="to.amount"),
            @Mapping(target="campaign", ignore = true),
            @Mapping(target="contributor", ignore = true)
    })
    ContributionTO contributionTOToContribution(ContributionTO to);
}
