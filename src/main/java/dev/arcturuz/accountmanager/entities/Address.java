package dev.arcturuz.accountmanager.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Collection;

@Entity
public class Address {

    @Id
    private Long id;

    private String street;
    private Integer number;
    private String City;
    private String Country;

    @ManyToMany(mappedBy = "address")
    private Collection<User> users;
}
