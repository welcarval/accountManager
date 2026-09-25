package dev.arcturuz.accountmanager.services;

import dev.arcturuz.accountmanager.dto.AddressDTO;
import dev.arcturuz.accountmanager.dto.UserDTO;
import dev.arcturuz.accountmanager.entities.Address;
import dev.arcturuz.accountmanager.entities.User;
import dev.arcturuz.accountmanager.mappers.AddressMapper;
import dev.arcturuz.accountmanager.mappers.UserMapper;
import dev.arcturuz.accountmanager.repositories.AddressRepository;
import dev.arcturuz.accountmanager.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
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
        AddressDTO addressDTO = new AddressDTO("0999999", 100, "hollywood boulevard", "hollywood", "usa");
        Address address = new Address();
        UserDTO userDTO = new UserDTO("John", "Doe", "johndoe@gmail.com", LocalDate.of(1995, 10, 5), List.of(addressDTO));
        User user = new User();
        user.setAddresses(List.of(address));
        when(userMapper.toEntity(userDTO)).thenReturn(user);
        when(addressMapper.toEntity(addressDTO)).thenReturn(address);
        userService.insertUser(userDTO);
        verify(userMapper).toEntity(userDTO);
        verify(addressRepository).saveAll(List.of(address));
    }

}