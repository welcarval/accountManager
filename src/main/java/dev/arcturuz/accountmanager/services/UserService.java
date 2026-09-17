package dev.arcturuz.accountmanager.services;

import dev.arcturuz.accountmanager.dto.UserDTO;
import dev.arcturuz.accountmanager.entities.User;
import dev.arcturuz.accountmanager.mappers.UserMapper;
import dev.arcturuz.accountmanager.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper mapper;
    private final UserRepository repository;

    public UserService(UserMapper mapper, UserRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public void insertUser(UserDTO userDTO) {
        User user = mapper.toEntity(userDTO);
        repository.save(user);
    }
}
