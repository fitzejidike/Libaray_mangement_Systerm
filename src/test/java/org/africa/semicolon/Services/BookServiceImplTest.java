package org.africa.semicolon.Services;


import org.africa.semicolon.Data.Model.Book;
import org.africa.semicolon.Data.repository.BookRepo;
import org.africa.semicolon.dtos.requests.AddBookRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.africa.semicolon.Data.Model.Genre.COMEDY;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

public class BookServiceImplTest {
    @Autowired
    BookServices bookServices;

    @Autowired
    BookRepo bookRepo;
    @Autowired
    LibrarianServices librarianServices;

    public AddBookRequest addBookRequest;


    @Test
 void Test_that_user_can_add_book() {
        Book book = new Book();
        addBookRequest.setGenre(COMEDY);
        addBookRequest.setTitle("F.O.E");
        addBookRequest.setAuthor("fitz");
        bookServices.addBook(addBookRequest);
         assertEquals(1, bookRepo.count());
    }
//    @Test
// void Test_to_delete_book() {
//        Book book = new Book();
//        addBookRequest.setGenre(COMEDY);
//        addBookRequest.setTitle("Eat a D");
//        addBookRequest.setAuthor("fitz");
//        bookServices.addBook(addBookRequest);
//        assertEquals(1,1);
//        librarianServices.deleteBookByTitle("Eat a D");
//    }
}