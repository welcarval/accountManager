package dev.arcturuz.accountmanager.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer number;

    private BigDecimal balance;

    private LocalDate creationDate;

    @OneToOne
    @JoinColumn(name = "id")
    private User user;

}
