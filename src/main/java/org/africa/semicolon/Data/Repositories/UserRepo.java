package org.africa.semicolon.Data.Repositories;

import org.africa.semicolon.Data.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends MongoRepository<User,String> {
}
