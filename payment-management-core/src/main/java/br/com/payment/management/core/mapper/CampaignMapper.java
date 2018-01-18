package br.com.payment.management.core.mapper;

import br.com.payment.management.core.bean.CampaignTO;
import br.com.payment.management.core.entity.Campaign;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * Mapper responsible for mapping values from a {@link Campaign} to a {@link CampaignTO} and vice-versa.
 *
 * @author wcustodio
 */
@Mapper(uses = {ProvingTypeMapper.class, ContributionMapper.class, BeadMapper.class})
public interface CampaignMapper {

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="name", source="name"),
            @Mapping(target="creationDate", source="creationDate"),
            @Mapping(target="initialDate", source="initialDate"),
            @Mapping(target="finalDate", source="finalDate"),
            @Mapping(target="church", ignore = true)
    })
    CampaignTO campaignToCampaignTO(Campaign entity);

    @Mappings({
            @Mapping(target="id", source="to.id"),
            @Mapping(target="name", source="to.name"),
            @Mapping(target="creationDate", source="to.creationDate"),
            @Mapping(target="initialDate", source="to.initialDate"),
            @Mapping(target="finalDate", source="to.finalDate"),
            @Mapping(target="church", ignore = true)
    })
    CampaignTO campaignTOToCampaign(CampaignTO to);
}
