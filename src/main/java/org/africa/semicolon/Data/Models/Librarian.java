package org.africa.semicolon.Data.Models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;


@EqualsAndHashCode(callSuper = true)
@Data
@Document("Librarian")
public class Librarian  extends  User{

}
