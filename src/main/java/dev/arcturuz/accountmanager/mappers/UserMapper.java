package dev.arcturuz.accountmanager.mappers;

import dev.arcturuz.accountmanager.dto.UserDTO;
import dev.arcturuz.accountmanager.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "account", ignore = true)
    UserDTO toDTO(User entity);

    User toEntity(UserDTO dto);
}
