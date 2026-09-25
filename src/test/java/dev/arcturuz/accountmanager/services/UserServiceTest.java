package dev.arcturuz.accountmanager.services;

import dev.arcturuz.accountmanager.dto.UserDTO;
import dev.arcturuz.accountmanager.entities.User;
import dev.arcturuz.accountmanager.mappers.UserMapper;
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

    @InjectMocks
    private UserService userService;

    @Test
    void shouldInsertAUserInTheDatabase() {
        UserDTO userDTO = new UserDTO("John", "Doe", "johndoe@gmail.com", LocalDate.of(1995, 10, 5));
        User user = new User();
        when(userMapper.toEntity(userDTO)).thenReturn(user);
        userService.insertUser(userDTO);
        verify(userMapper).toEntity(userDTO);
    }

}