package org.africa.semicolon.Data.Repositories;

import org.africa.semicolon.Data.Models.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepo extends MongoRepository<Transaction,String> {
}
