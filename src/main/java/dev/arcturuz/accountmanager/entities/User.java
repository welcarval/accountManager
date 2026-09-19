package dev.arcturuz.accountmanager.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Collection;

@Entity
@Table(name = "tb_users")
@ToString
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Setter
    private String firstName;

    @Setter
    private String lastName;

    @Setter
    private String email;

    @Setter
    private LocalDate birthDate;

    @OneToOne
    @JoinColumn(name = "id")
    private Account account;

    @ManyToMany
    private Collection<Address> addresses;

    public void addAddress(Address address) {
        addresses.add(address);
    }
}
