package org.africa.semicolon.Data.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

@Data
@Document("User")
public class User {
    @Id
    private String id;
    private String username;
    private String number;
    private String address;
    private Integer quantity;
    private boolean available;
    private List<Book> books = new ArrayList<>();
}
