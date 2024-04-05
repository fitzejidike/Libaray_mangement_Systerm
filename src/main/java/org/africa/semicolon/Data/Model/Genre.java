package org.africa.semicolon.Data.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Document")
public enum Genre {
    ROMANCE,
    THRILLER,
    ADULT,
    COMEDY,
    FANTASY,
    SCIENTIFIC,
    ANIME,

}
