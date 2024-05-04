package org.africa.semicolon.Data.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Librarian")
public class Librarian
{
    private String name;
    private String password;
    @Id
    private String id;

}
