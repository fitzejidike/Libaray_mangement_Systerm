package org.africa.semicolon.Data.Repositories;

import org.africa.semicolon.Data.Models.Bill;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepo extends MongoRepository<Bill,String> {
}
