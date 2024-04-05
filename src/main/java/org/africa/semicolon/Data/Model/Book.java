package org.africa.semicolon.Data.Model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Book")
public class Book {
 @Id
    private String  id;
    private  String author;
    private String title;
    private Genre genre;
}
