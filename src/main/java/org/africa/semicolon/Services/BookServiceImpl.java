package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Model.Book;
import org.africa.semicolon.Data.repository.BookRepo;
import org.africa.semicolon.dtos.requests.AddBookRequest;
import org.africa.semicolon.dtos.requests.DeletebookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.africa.semicolon.util.Mapper.map;

@Service
public class BookServiceImpl implements BookServices{
    @Autowired
    private BookRepo bookrepo;
    @Override
    public void addBook(AddBookRequest addBookRequest) {
        Book book = map(addBookRequest);
        bookrepo.save(book);
    }

    @Override
    public void deleteBook(DeletebookRequest deletebookRequest) {

    }

//    @Override
//    public DeleteBookResponse deleteBook(DeletebookRequest deletebookRequest) {
//      return Mapper.deleteBook(deletebookRequest,bookrepo);
//    }

}



