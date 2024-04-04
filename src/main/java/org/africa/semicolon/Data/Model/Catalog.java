package org.africa.semicolon.Data.Model;

import lombok.Data;

import java.util.List;

@Data
public class Catalog {
    private  String authorName;
    private List<Book> Books;
}
