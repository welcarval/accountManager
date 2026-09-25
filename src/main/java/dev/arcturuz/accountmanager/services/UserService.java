package dev.arcturuz.accountmanager.services;

import dev.arcturuz.accountmanager.dto.UserDTO;
import dev.arcturuz.accountmanager.entities.User;
import dev.arcturuz.accountmanager.mappers.UserMapper;
import dev.arcturuz.accountmanager.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public UserService(UserMapper mapper, UserRepository repository) {
        this.userMapper = mapper;
        this.userRepository = repository;
    }

    public void insertUser(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        userRepository.save(user);
    }
}
