package org.africa.semicolon.Data.repository;

import org.africa.semicolon.Data.Model.Bill;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepo extends MongoRepository<Bill,String> {


}
