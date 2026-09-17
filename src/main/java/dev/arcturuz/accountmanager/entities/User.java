package dev.arcturuz.accountmanager.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Collection;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthDate;

    @OneToOne
    @JoinColumn(name = "id")
    private Account account;

    @ManyToMany
    private Collection<Address> addresses;
}
