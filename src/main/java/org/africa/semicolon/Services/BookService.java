package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.Book;
import org.africa.semicolon.Dtos.Requests.*;
import org.africa.semicolon.Dtos.Response.DeleteAllBookResponse;
import org.africa.semicolon.Dtos.Response.DeleteBookResponse;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

    Book addBook(AddBookRequest addBookRequest);
    DeleteBookResponse deleteBook(DeleteBookRequest deleteBookRequest);
    DeleteAllBookResponse deleteAllBooks(DeleteAllBooksRequest deleteAllBooksRequest);
    Book getBookInfo(GetBookInfoRequest getBookInfoRequest);
    long count();
    Book findBookByTitle(FindBookRequest findBookRequest);
}
