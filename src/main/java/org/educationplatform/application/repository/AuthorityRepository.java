package org.educationplatform.application.repository;

import org.educationplatform.application.domain.Authority;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
