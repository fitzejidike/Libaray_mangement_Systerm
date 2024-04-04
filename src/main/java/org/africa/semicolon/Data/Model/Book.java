package org.africa.semicolon.Data.Model;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Book {
 @Id
    private String  id;
    private  String authorName;
    private String nameOfBook;
}
