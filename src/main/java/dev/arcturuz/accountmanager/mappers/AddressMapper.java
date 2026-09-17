package dev.arcturuz.accountmanager.mappers;

import dev.arcturuz.accountmanager.dto.AddressDTO;
import dev.arcturuz.accountmanager.entities.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address toEntity(AddressDTO dto);

    AddressDTO toDto(Address entity);
}
