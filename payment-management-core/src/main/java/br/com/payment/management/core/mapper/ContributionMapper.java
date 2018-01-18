package br.com.payment.management.core.mapper;

import br.com.payment.management.core.bean.ContributionTO;
import br.com.payment.management.core.entity.Contribution;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.sql.Date;

/**
 * Mapper responsible for mapping values from a {@link Contribution} to a {@link ContributionTO} and vice-versa.
 *
 * @author wcustodio
 */
@Mapper(imports = {Date.class})
public interface ContributionMapper {

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="creationDate", source="creationDate"),
            @Mapping(target="amount", source="amount"),
            @Mapping(target="campaign", ignore = true),
            @Mapping(target="contributor", ignore = true)
    })
    ContributionTO contributionToContributionTO(Contribution entity);

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="creationDate", source="creationDate"),
            @Mapping(target="amount", source="amount"),
            @Mapping(target="campaign", ignore = true),
            @Mapping(target="contributor", ignore = true)
    })
    ContributionTO contributionTOToContribution(ContributionTO to);
}