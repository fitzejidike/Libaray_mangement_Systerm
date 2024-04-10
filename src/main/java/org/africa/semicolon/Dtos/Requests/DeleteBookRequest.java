package org.africa.semicolon.Dtos.Requests;

import lombok.Data;
import org.africa.semicolon.Data.Models.Genre;

@Data
public class DeleteBookRequest {
    private String title;
    private Genre genre;
    private String author;
}
