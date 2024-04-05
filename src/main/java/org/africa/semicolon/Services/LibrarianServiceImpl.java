package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Model.Bill;
import org.africa.semicolon.Data.Model.Book;
import org.africa.semicolon.Data.repository.BillRepo;
import org.africa.semicolon.Data.repository.BookRepo;
import org.africa.semicolon.dtos.requests.*;

public class LibrarianServiceImpl implements LibrarianServices{
    private BookRepo bookRepo;
    private BillRepo billrepo;


    @Override
    public Book searchBook(SearchBookRequest searchBookRequest) {
        Book book = new Book();


        return null;
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
    public Book addBook(AddBookRequest addBookRequest) {
        Book book = new Book();
        book.setAuthor(addBookRequest.getAuthor());
        book.setTitle(addBookRequest.getTitle());
        book.setGenre(addBookRequest.getGenre());
        bookRepo.save(book);
        return book;


    }
}
