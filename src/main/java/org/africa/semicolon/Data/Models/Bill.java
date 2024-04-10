package org.africa.semicolon.Data.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Document("Document")
public class Bill {
    @Id
    private String Id;
    private BigDecimal amount;
    private LocalDate date;
}
