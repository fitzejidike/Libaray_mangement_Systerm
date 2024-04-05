package org.africa.semicolon.Data.repository;

import org.africa.semicolon.Data.Model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepo extends MongoRepository<Transaction,String> {
}
