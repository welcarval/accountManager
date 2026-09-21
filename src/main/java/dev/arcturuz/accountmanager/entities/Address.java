package dev.arcturuz.accountmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Entity
@Setter
@Getter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String street;
    private Integer number;
    private String city;
    private String country;

    @ManyToMany(mappedBy = "addresses")
    private Collection<User> users;
}
