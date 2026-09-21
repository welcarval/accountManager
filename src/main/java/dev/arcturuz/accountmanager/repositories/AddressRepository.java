package dev.arcturuz.accountmanager.repositories;

import dev.arcturuz.accountmanager.entities.Address;
import dev.arcturuz.accountmanager.entities.AddressId;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, AddressId> {
}
