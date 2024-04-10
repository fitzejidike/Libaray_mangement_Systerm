package org.africa.semicolon.Dtos.Requests;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
public class CreateUserRequestRequest {
    private  String userName;
    private String address;
    private String number;
    private String Password;
}
