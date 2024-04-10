package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.Book;
import org.africa.semicolon.Data.Repositories.BookRepo;
import org.africa.semicolon.Dtos.Requests.*;
import org.africa.semicolon.Dtos.Response.DeleteAllBookResponse;
import org.africa.semicolon.Dtos.Response.DeleteBookResponse;
import org.africa.semicolon.Exceptions.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepo bookRepo;
    @Override
    public Book addBook(AddBookRequest addBookRequest) {
        Book book = new Book();
        book.setAuthor(addBookRequest.getAuthor());
        book.setAuthor(addBookRequest.getTitle());
        book.setGenre(addBookRequest.getGenre());
        bookRepo.save(book);
        return book;
    }

    @Override
    public DeleteBookResponse deleteBook(DeleteBookRequest deleteBookRequest) {
        Book foundBook = bookRepo.findBookByTitle(deleteBookRequest.getTitle());
      if (foundBook == null)
        throw new BookNotFoundException("Book not found");
       bookRepo.delete(foundBook);

       DeleteBookResponse deleteBookResponse = new DeleteBookResponse();
       String message = "Book successfully deleted";
       deleteBookResponse.setTitle(deleteBookRequest.getTitle());
       deleteBookResponse.setMessage(message);
       return deleteBookResponse;

    }

    @Override
    public DeleteAllBookResponse deleteAllBooks(DeleteAllBooksRequest deleteAllBooksRequest) {
        bookRepo.deleteAll();
        DeleteAllBookResponse deleteAllBookResponse = new DeleteAllBookResponse();
        String message = "Book successfully deleted";
        deleteAllBookResponse.setMessage(message);
        return deleteAllBookResponse;
    }

    @Override
    public Book getBookInfo(GetBookInfoRequest getBookInfoRequest) {
        Book book = new Book();
        if (bookRepo.findBookByTitle(getBookInfoRequest.getTitle()) == null)
            throw new BookNotFoundException("Book not found");
        book.setTitle(getBookInfoRequest.getTitle());
        book.setAuthor(getBookInfoRequest.getAuthor());
        book.setGenre(getBookInfoRequest.getGenre());
        return book;
    }

    @Override
    public long count() {
        return bookRepo.count();
    }

    @Override
    public Book findBookByTitle(FindBookRequest findBookRequest) {
        return bookRepo.findBookByTitle(findBookRequest.getTitle());
    }


}
