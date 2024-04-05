package org.africa.semicolon.Data.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Data
@Document("Transaction")
public class Transaction {
    @Id
    private String transactionId;
    private String id;
    private LocalDate dateOfIssue;
    private LocalDate dueDate;

}
