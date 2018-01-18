package br.com.payment.management.core.mapper;

import br.com.payment.management.core.bean.BeadTO;
import br.com.payment.management.core.entity.Bead;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * Mapper responsible for mapping values from a {@link Bead} to a {@link BeadTO} and vice-versa.
 *
 * @author wcustodio
 */
@Mapper
public interface BeadMapper {

    BeadMapper MAPPER = Mappers.getMapper(BeadMapper.class);

    @Mappings({
            @Mapping(target="contributor", ignore = true),
            @Mapping(target="campaign", ignore = true),
            @Mapping(target="contributions", ignore = true)
    })
    BeadTO beadToBeadTO(Bead entity);

    @Mappings({
            @Mapping(target="contributor", ignore = true),
            @Mapping(target="campaign", ignore = true),
            @Mapping(target="contributions", ignore = true)
    })
    BeadTO beadTOToBead(BeadTO to);
}