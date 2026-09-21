package dev.arcturuz.accountmanager.dto;

import java.time.LocalDate;
import java.util.List;

public record UserDTO(
        String firstName,
        String lastName,
        String email,
        LocalDate birthDate,
        List<AddressDTO> addresses
) {
}
