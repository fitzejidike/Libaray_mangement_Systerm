package org.africa.semicolon.Data.repository;

import org.africa.semicolon.Data.Model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BookRepoTest {
    @Autowired
    BookRepo bookRepo;
    @Test

    public  void book_can_be_saved(){
        Book book = new Book();


    }

}