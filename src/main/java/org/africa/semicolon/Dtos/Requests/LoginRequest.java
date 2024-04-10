package org.africa.semicolon.Dtos.Requests;

import lombok.Data;

@Data
public class LoginRequest {
    private String userName;
    private String password;
}
