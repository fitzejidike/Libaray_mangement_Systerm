package org.africa.semicolon.Dtos.Requests;

import lombok.Data;

@Data
public class RegisterUserRequest {
    private  String userName;
    private  String password;
    private  String address;
    private  String number;
}
