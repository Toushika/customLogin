package com.enigma.dev.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoleUser {
    private int user_id;
    private int role_id;
    private String createdTime;
}
