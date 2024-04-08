package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.Book;
import org.africa.semicolon.Dtos.Requests.AddBookRequest;
import org.africa.semicolon.Dtos.Requests.DeleteBookRequest;
import org.africa.semicolon.Dtos.Response.DeleteBookResponse;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
    Book addBook(AddBookRequest addBookRequest);
    DeleteBookResponse deleteBook(DeleteBookRequest deletebookRequest);

    DeleteBookResponse deleteAllBooks(DeleteBookRequest deleteBookRequest);
}
