package dev.arcturuz.accountmanager.repositories;

import dev.arcturuz.accountmanager.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByFirstName(String s);
}
