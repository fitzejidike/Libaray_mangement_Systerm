package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Model.Bill;
import org.africa.semicolon.Data.Model.Book;
import org.africa.semicolon.dtos.requests.*;
import org.springframework.stereotype.Service;

@Service
public interface LibrarianServices {

    Book searchBook(SearchBookRequest searchBookRequest);

    Bill createBill(CreateBillRequest createBillRequest);

    Book AddBookResponse(AddBookRequest addBookRequest);

    Void deleteBookByTitle(DeletebookRequest deletebookRequest);
}