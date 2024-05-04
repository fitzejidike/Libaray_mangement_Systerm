package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Model.Bill;
import org.africa.semicolon.Data.Model.Book;
import org.africa.semicolon.Data.repository.BillRepo;
import org.africa.semicolon.Data.repository.BookRepo;
import org.africa.semicolon.Execption.BookNotFoundException;
import org.africa.semicolon.dtos.requests.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibrarianServiceImpl implements LibrarianServices {
    @Autowired
    private BookRepo bookRepo;
    @Autowired
    private BillRepo billrepo;


    @Override
    public Book searchBook(SearchBookRequest searchBookRequest) {
        return bookRepo.findBookByTitle(searchBookRequest.getTitle());

    }


    @Override
    public Bill createBill(CreateBillRequest createBillRequest) {
        Bill bill = new Bill();
        bill.setId(createBillRequest.getId());
        bill.setDate(createBillRequest.getDate());
        bill.setAmount(createBillRequest.getAmount());
        billrepo.save(bill);
        return bill;
    }

    @Override
    public Book AddBookResponse(AddBookRequest addBookRequest) {
        Book book = new Book();
        book.setAuthor(addBookRequest.getAuthor());
        book.setTitle(addBookRequest.getTitle());
        book.setGenre(addBookRequest.getGenre());
        bookRepo.save(book);
        return book;

    }

    @Override
    public Void deleteBookByTitle(DeletebookRequest deletebookRequest) {
        Book book = bookRepo.findBookByTitle(deletebookRequest.getTitle());
        if (book == null) throw new BookNotFoundException("book not found");
        bookRepo.delete(book);
        return null;

    }


}
