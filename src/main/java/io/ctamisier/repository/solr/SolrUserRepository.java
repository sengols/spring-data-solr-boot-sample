package io.ctamisier.repository.solr;

import io.ctamisier.model.User;
import org.springframework.data.solr.repository.SolrCrudRepository;

public interface SolrUserRepository extends SolrCrudRepository<User, Long> {
}
