package org.africa.semicolon.dtos.requests;

import lombok.Data;

@Data
public class DeleteUserRequest {
    private String  id;
    private String username;

}
