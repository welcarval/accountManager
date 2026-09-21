package dev.arcturuz.accountmanager.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AddressId implements Serializable {
    private String postalCode;
    private Integer number;
}
