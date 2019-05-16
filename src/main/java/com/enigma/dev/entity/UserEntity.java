package com.enigma.dev.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user_info")
public class UserEntity {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    @Size(max = 255)
    @NotNull
    private String userName;

    @Column(name = "user_email")
    @Size(max = 255)
    @NotNull
    private String userEmail;

    @Column(name = "user_password")
    @Size(max = 255)
    @NotNull
    private String userPassword;


    @Column(name = "user_address")
    @Size(max = 1000)
    @NotNull
    private String userAddress;


    @Column(name = "user_gender")
    @Size(max = 255)
    @NotNull
    private String userGender;

    @Column(name = "user_mobile")
    @Size(max = 255)
    @NotNull
    private String userMobile;

    @Column(name = "created_time")
    @Size(max = 255)
    @NotNull
    private String createdTime;
}
