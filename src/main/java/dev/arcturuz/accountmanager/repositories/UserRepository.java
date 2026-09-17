package dev.arcturuz.accountmanager.repositories;

import dev.arcturuz.accountmanager.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
