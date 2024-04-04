package org.africa.semicolon.Data.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.security.PrivateKey;

@Data
public class Normal_User extends User{
    @Id
    private String id;
    private String name;
    private String address;

}
