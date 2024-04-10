package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.Book;
import org.africa.semicolon.Data.Repositories.BookRepo;
import org.africa.semicolon.Dtos.Requests.AddBookRequest;
import org.africa.semicolon.Dtos.Requests.DeleteBookRequest;
import org.africa.semicolon.Dtos.Response.DeleteBookResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.africa.semicolon.Data.Models.Genre.*;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BookServiceImplTest {
    @Autowired
    BookService bookService;

    @Autowired
    BookRepo bookRepo;
    @Autowired
    LibrarianService librarianService;

    @Test
    public void testToAddABook(){
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setGenre(COMEDY);
        addBookRequest.setTitle("F.O.E");
        addBookRequest.setAuthor("fitz");
        bookService.addBook(addBookRequest);
        assertEquals(1, bookService.count());
    }
    @Test

    public void testToDeleteBook(){
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setGenre(COMEDY);
        addBookRequest.setTitle("F.O.E");
        addBookRequest.setAuthor("fitz");
        bookService.addBook(addBookRequest);
        assertEquals(1, bookRepo.count());
        DeleteBookRequest deleteBookRequest = new DeleteBookRequest();
        deleteBookRequest.setTitle("F.O.E");
        deleteBookRequest.setAuthor("fitz");
        deleteBookRequest.setGenre(COMEDY);
        bookService.deleteBook(deleteBookRequest);
        assertEquals(0, bookService.count());
    }

    @Test

    void testToAddTwoBookAndDeleteOne(){
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setGenre(COMEDY);
        addBookRequest.setTitle("F.O.E");
        addBookRequest.setAuthor("fitz");
        bookService.addBook(addBookRequest);
        AddBookRequest addBookRequest1 =new AddBookRequest();
        addBookRequest1.setAuthor("leo");
        addBookRequest1.setTitle("owl");
        addBookRequest1.setGenre(ANIME);
        bookService.addBook(addBookRequest1);
        assertEquals(2,bookService.count());
    }


    }

