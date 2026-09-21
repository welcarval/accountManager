package dev.arcturuz.accountmanager.dto;

public record AddressDTO(
        String postalCode,
        Integer number,
        String street,
        String city,
        String country
) {
}
