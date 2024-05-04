package org.africa.semicolon.util;

import org.africa.semicolon.Data.Model.Book;
import org.africa.semicolon.Data.repository.BookRepo;
import org.africa.semicolon.dtos.requests.AddBookRequest;
import org.africa.semicolon.dtos.requests.DeletebookRequest;
import org.africa.semicolon.dtos.response.AddBookResponse;
import org.africa.semicolon.dtos.response.DeleteBookResponse;

public class Mapper {

    public static Book map(AddBookRequest addBookRequest) {
        Book book = new Book();
        book.setAuthor(addBookRequest.getAuthor());
        book.setTitle(addBookRequest.getTitle());
        book.setGenre(addBookRequest.getGenre());
        return book;
    }
    public static AddBookResponse getAddBookResponse(AddBookRequest addBookRequest) {
        AddBookResponse addBookResponse = new AddBookResponse();
        addBookResponse.setAuthor(addBookRequest.getAuthor());
        addBookResponse.setGenre(addBookRequest.getGenre());
        addBookResponse.setTitle(addBookRequest.getTitle());
        String message = "Book saved";
        addBookResponse.setMessage(message);
        return addBookResponse;
    }
    public static DeleteBookResponse deleteBook(DeletebookRequest deletebookRequest, BookRepo bookrepo){
        Book book = new Book();
        book.setAuthor(deletebookRequest.getAuthorName());
        book.setTitle(deletebookRequest.getTitle());
        bookrepo.delete(book);
        DeleteBookResponse deleteBookResponse = new DeleteBookResponse();
        String message = "Book successfully deleted";
        deleteBookResponse.setMessage(message);
       return deleteBookResponse;
    }


}