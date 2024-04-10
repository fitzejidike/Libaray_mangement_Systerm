package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.Bill;
import org.africa.semicolon.Data.Models.Book;
import org.africa.semicolon.Data.Models.Librarian;
import org.africa.semicolon.Data.Repositories.BookRepo;
import org.africa.semicolon.Data.Repositories.LibrarianRepo;
import org.africa.semicolon.Dtos.Requests.*;
import org.africa.semicolon.Exceptions.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibrarianServiceImpl implements LibrarianService{
    @Autowired
    LibrarianRepo librarianRepo;
    @Autowired
    BookService bookService;
    @Autowired
    BookRepo bookRepo;
    UserService userService;
       @Override
    public Librarian login(LoginRequest loginRequest) {
        Librarian foe = new Librarian();
        foe.setUsername(loginRequest.getUserName());
        foe.setPassword(loginRequest.getPassword());
        userService.Login(loginRequest);
        librarianRepo.save(foe);
        return foe;
    }

    @Override
    public Book searchBook(FindBookRequest findBookRequest) {
           Book foundBook = bookRepo.findBookByTitle(findBookRequest.getTitle());
        if (foundBook == null)
            throw new BookNotFoundException("Book not found");
        return foundBook;
    }

    @Override
    public Book showDueDate(FindDueDateRequest findDueDateRequest) {
        return null;
    }

    @Override
    public Bill createBill(CreateBillRequest createBillRequest) {
        return null;
    }

    @Override
    public Void deleteBookByTitle(DeleteBookRequest deletebookRequest) {
        return null;
    }
}

