package org.africa.semicolon.Data.Repositories;

import org.africa.semicolon.Data.Models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends MongoRepository<Book,String> {
    Book findBookByTitle(String title);
    Book findBookByAuthor(String author);


}
