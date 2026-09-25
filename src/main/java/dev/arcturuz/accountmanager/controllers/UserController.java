package dev.arcturuz.accountmanager.controllers;

import dev.arcturuz.accountmanager.dto.UserDTO;
import dev.arcturuz.accountmanager.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
// TODO remove this specific CORS config
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void insertUser(@RequestBody UserDTO user) {
        userService.insertUser(user);
    }
}
