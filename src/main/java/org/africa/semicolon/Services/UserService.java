package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Model.Book;
import org.africa.semicolon.dtos.requests.AddBookRequest;
import org.africa.semicolon.dtos.requests.IssueBookRequest;
import org.africa.semicolon.dtos.requests.SearchBookRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Book searchBook(SearchBookRequest searchBookRequest);
    Book bookPurchase();
    Book ReadBook();


}
