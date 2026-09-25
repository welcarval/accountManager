package dev.arcturuz.accountmanager.mappers;

import dev.arcturuz.accountmanager.dto.UserDTO;
import dev.arcturuz.accountmanager.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDTO(User entity);

    User toEntity(UserDTO dto);
}
