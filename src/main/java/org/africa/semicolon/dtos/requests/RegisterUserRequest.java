package org.africa.semicolon.dtos.requests;

import lombok.Data;

@Data
public class RegisterUserRequest {
    private String name;
    private String number;
    private String address;
}
