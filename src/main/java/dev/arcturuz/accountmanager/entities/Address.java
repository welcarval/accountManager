package dev.arcturuz.accountmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Entity
@Setter
@Getter
@IdClass(AddressId.class)
@Table(name = "tb_address")
public class Address {

    @Id
    private String postalCode;

    @Id
    private Integer number;

    private String street;
    private String city;
    private String country;

    @ManyToMany(mappedBy = "addresses")
    private Collection<User> users;
}
