package io.ctamisier.repository.jpa;

import io.ctamisier.model.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}
