package org.africa.semicolon.Data.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
public class Librarian {
    private String name;
    private String password;
    @Id
    private String id;

}
