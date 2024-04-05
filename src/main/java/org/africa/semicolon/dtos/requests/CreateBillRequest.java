package org.africa.semicolon.dtos.requests;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class CreateBillRequest {
    private BigDecimal amount;
    private LocalDate date;
    private String id;

}
