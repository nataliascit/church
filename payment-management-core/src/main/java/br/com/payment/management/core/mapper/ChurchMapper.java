package br.com.payment.management.core.mapper;

import br.com.payment.management.core.bean.ChurchTO;
import br.com.payment.management.core.entity.Church;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Mapper responsible for mapping values from a {@link Church} to a {@link ChurchTO} and vice-versa.
 *
 * @author wcustodio
 */
@Mapper(uses = {CampaignMapper.class})
public interface ChurchMapper {

    ChurchMapper MAPPER = Mappers.getMapper(ChurchMapper.class);

    ChurchTO churchToChurchTO(Church entity);

    ChurchTO churchTOToChurch(ChurchTO to);
}