package org.africa.semicolon.Dtos.Requests;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
public class CreateBillRequest {
    private String Id;
    private BigDecimal amount;
    private LocalDate date;


}
