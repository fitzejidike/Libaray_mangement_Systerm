package org.africa.semicolon.dtos.requests;

import lombok.Data;
import org.africa.semicolon.Data.Model.Genre;

@Data
public class AddBookRequest {
    private  String author;
    private  String title;
    private Genre genre;


}
