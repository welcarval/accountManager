package dev.arcturuz.accountmanager.dto;

import java.time.LocalDate;

public record UserDTO(
        String firstName,
        String lastName,
        String email,
        LocalDate birthDate
) {
}
