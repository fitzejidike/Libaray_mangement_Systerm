package org.africa.semicolon.Services;

import lombok.Data;
import org.africa.semicolon.Data.Model.Book;
import org.africa.semicolon.dtos.requests.AddBookRequest;
import org.africa.semicolon.dtos.requests.DeletebookRequest;
import org.africa.semicolon.dtos.requests.SearchBookRequest;


public interface BookServices {
    Book addBook(AddBookRequest addBookRequest);
    void  deleteBook(DeletebookRequest deletebookRequest);
    Book searchBook(SearchBookRequest searchBookRequest);
}
