package org.africa.semicolon.Dtos.Requests;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class BuyBookRequset {
    private String author;
    private String title;
    private BigDecimal amount;
}
