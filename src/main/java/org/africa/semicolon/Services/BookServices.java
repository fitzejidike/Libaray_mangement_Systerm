package org.africa.semicolon.Services;

import org.africa.semicolon.dtos.requests.AddBookRequest;
import org.africa.semicolon.dtos.requests.DeletebookRequest;
import org.springframework.stereotype.Service;

@Service
public interface BookServices {
    void addBook(AddBookRequest addBookRequest);
    void deleteBook(DeletebookRequest deletebookRequest);

}
