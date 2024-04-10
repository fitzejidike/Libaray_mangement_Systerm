package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.Bill;
import org.africa.semicolon.Data.Models.Book;
import org.africa.semicolon.Data.Models.Librarian;
import org.africa.semicolon.Dtos.Requests.*;
import org.springframework.stereotype.Service;


public interface LibrarianService {
    Librarian login(LoginRequest loginRequest);
    Book searchBook(FindBookRequest findBookRequest);
    Book showDueDate(FindDueDateRequest findDueDateRequest);
    Bill createBill(CreateBillRequest createBillRequest);
    Void deleteBookByTitle(DeleteBookRequest deletebookRequest);

}
