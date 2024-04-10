package org.africa.semicolon.Data.Repositories;

import org.africa.semicolon.Data.Models.Librarian;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepo extends MongoRepository<Librarian,String> {
}
