package org.africa.semicolon.dtos.requests;

import lombok.Data;

@Data
public class SearchBookRequest {
    private String title;
    private String author;
}
