package dev.arcturuz.accountmanager.services;

import dev.arcturuz.accountmanager.dto.UserDTO;
import dev.arcturuz.accountmanager.entities.User;
import dev.arcturuz.accountmanager.mappers.AddressMapper;
import dev.arcturuz.accountmanager.mappers.UserMapper;
import dev.arcturuz.accountmanager.repositories.AddressRepository;
import dev.arcturuz.accountmanager.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private UserMapper userMapper;

    @Mock
    private AddressMapper addressMapper;

    @Mock
    private AddressRepository addressRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void shouldInsertAUserInTheDatabase() {
        UserDTO userDTO = new UserDTO("John", "Doe", "johndoe@gmail.com", LocalDate.of(1995, 10, 5), null);
        User user = new User();
        when(userMapper.toEntity(userDTO)).thenReturn(user);
        userService.insertUser(userDTO);
        verify(userMapper).toEntity(userDTO);
    }

}