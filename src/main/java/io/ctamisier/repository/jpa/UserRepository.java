package io.ctamisier.repository.jpa;

import io.ctamisier.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
