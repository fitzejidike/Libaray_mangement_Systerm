package org.africa.semicolon.dtos.response;

import lombok.Data;
import org.africa.semicolon.Data.Model.Genre;

@Data
public class AddBookResponse {
    private String message;
    private String author;
    private String title;
    private Genre genre;

}
