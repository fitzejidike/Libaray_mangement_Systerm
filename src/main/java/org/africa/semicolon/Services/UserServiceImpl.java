package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Model.Book;
import org.africa.semicolon.Data.Model.User;
import org.africa.semicolon.Data.repository.BookRepo;
import org.africa.semicolon.dtos.requests.IssueBookRequest;
import org.africa.semicolon.dtos.requests.SearchBookRequest;

public class UserServiceImpl implements UserService {
    private BookRepo bookRepo;
    private Book book;


    @Override
    public Book searchBook(SearchBookRequest searchBookRequest) {
        return bookRepo.findBookByAuthorAndTitle(searchBookRequest.getAuthor(),searchBookRequest.getTitle());
    }
    @Override
    public Book bookPurchase() {
        return null;
    }

    @Override
    public Book ReadBook() {
        return null;
    }


}
