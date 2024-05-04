package org.africa.semicolon.dtos.requests;

import lombok.Data;
import org.africa.semicolon.Data.Model.Genre;

@Data
public class DeletebookRequest {
    private String authorName;
    private String title;

}
