package org.africa.semicolon.Data.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class PremiumUser extends User {
    @Id
    private String id;
    private String name;
    private String number;
    private String address;
}
