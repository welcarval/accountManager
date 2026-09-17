package dev.arcturuz.accountmanager.services;

import dev.arcturuz.accountmanager.dto.AddressDTO;
import dev.arcturuz.accountmanager.dto.UserDTO;
import dev.arcturuz.accountmanager.entities.Address;
import dev.arcturuz.accountmanager.entities.User;
import dev.arcturuz.accountmanager.mappers.AddressMapper;
import dev.arcturuz.accountmanager.mappers.UserMapper;
import dev.arcturuz.accountmanager.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserMapper userMapper;
    private final AddressMapper addressMapper;
    private final UserRepository repository;

    public UserService(UserMapper mapper, UserRepository repository, AddressMapper addressMapper) {
        this.userMapper = mapper;
        this.repository = repository;
        this.addressMapper = addressMapper;
    }

    public void insertUser(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        repository.save(user);
    }

    public void addAddress(UserDTO userDTO, AddressDTO addressDTO) {
        Optional<User> optionalUser = repository.findByFirstName(userDTO.firstName());

        Address address = addressMapper.toEntity(addressDTO);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.addAddress(address);
            repository.save(user);
        }
    }
}
