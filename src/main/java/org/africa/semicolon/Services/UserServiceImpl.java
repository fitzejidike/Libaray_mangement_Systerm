package org.africa.semicolon.Services;

import lombok.RequiredArgsConstructor;
import org.africa.semicolon.Data.Model.Book;
import org.africa.semicolon.Data.repository.BookRepo;
import org.africa.semicolon.dtos.requests.SearchBookRequest;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private BookRepo bookRepo;
    private Book book;


    @Override
    public Book searchBook(SearchBookRequest searchBookRequest) {
        return bookRepo.findBookByTitle(searchBookRequest.getTitle());
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
