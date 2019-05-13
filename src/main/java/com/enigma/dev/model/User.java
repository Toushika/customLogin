package com.enigma.dev.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userAddress;
    private String userGender;
    private String userMobile;
    private String createdTime;
}
