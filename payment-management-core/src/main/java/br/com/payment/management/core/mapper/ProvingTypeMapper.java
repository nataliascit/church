package br.com.payment.management.core.mapper;

import br.com.payment.management.core.bean.ProvingTypeTO;
import br.com.payment.management.core.entity.ProvingType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * Mapper responsible for mapping values from a {@link ProvingType} to a {@link ProvingTypeTO} and vice-versa.
 *
 * @author wcustodio
 */
@Mapper
public interface ProvingTypeMapper {

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="name", source="name"),
            @Mapping(target="mnemonic", source="mnemonic"),
            @Mapping(target="campaigns", ignore = true)
    })
    ProvingTypeTO provingTypeToProvingTypeTO(ProvingType entity);

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="name", source="name"),
            @Mapping(target="mnemonic", source="mnemonic"),
            @Mapping(target="campaigns", ignore = true)
    })
    ProvingTypeTO provingTypeTOToProvingType(ProvingTypeTO to);
}
