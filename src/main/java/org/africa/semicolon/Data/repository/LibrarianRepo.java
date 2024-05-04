package org.africa.semicolon.Data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepo extends MongoRepository<LibrarianRepo, String> {
}
