package br.com.payment.management.core.mapper;

import br.com.payment.management.core.bean.ProvingTypeTO;
import br.com.payment.management.core.entity.ProvingType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Mapper responsible for mapping values from a {@link ProvingType} to a {@link ProvingTypeTO} and vice-versa.
 *
 * @author wcustodio
 */
@Mapper
public interface ProvingTypeMapper {

    ProvingTypeMapper MAPPER = Mappers.getMapper(ProvingTypeMapper.class);

    @Mapping(target="campaigns", ignore = true)
    ProvingTypeTO provingTypeToProvingTypeTO(ProvingType entity);

    @Mapping(target="campaigns", ignore = true)
    ProvingTypeTO provingTypeTOToProvingType(ProvingTypeTO to);
}
