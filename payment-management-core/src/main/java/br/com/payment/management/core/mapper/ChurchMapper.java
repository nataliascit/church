package br.com.payment.management.core.mapper;

import br.com.payment.management.core.bean.ChurchTO;
import br.com.payment.management.core.entity.Church;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * Mapper responsible for mapping values from a {@link Church} to a {@link ChurchTO} and vice-versa.
 *
 * @author wcustodio
 */
@Mapper(uses = {CampaignMapper.class})
public interface ChurchMapper {

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="name", source="name")
    })
    ChurchTO churchToChurchTO(Church entity);

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="name", source="name")
    })
    ChurchTO churchTOToChurch(ChurchTO to);
}