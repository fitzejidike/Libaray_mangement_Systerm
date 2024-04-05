package org.africa.semicolon.Data.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Document("Bill")
public class Bill {
    private String billNo;
    @Id
    private String id;
    private BigDecimal amount;
    private LocalDate date;


}
