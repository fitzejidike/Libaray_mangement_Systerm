package org.africa.semicolon.Execption;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String e) {
        super(e);
    }
}
