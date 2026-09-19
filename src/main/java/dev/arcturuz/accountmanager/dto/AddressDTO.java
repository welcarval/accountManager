package dev.arcturuz.accountmanager.dto;

public record AddressDTO(
        String street,
        Integer number,
        String city,
        String country
) {
}
