package dev.arcturuz.accountmanager.controllers;

import dev.arcturuz.accountmanager.dto.UserDTO;
import dev.arcturuz.accountmanager.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void getUser(@RequestBody UserDTO user) {
        userService.insertUser(user);
    }
}
