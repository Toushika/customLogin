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
@Table(name = "user_role")
public class RoleEntity {
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "role_name")
    @Size(max = 255)
    @NotNull
    private String roleName;

    @Column(name = "created_time")
    @Size(max = 255)
    @NotNull
    private String createdTime;

    @OneToOne(mappedBy = "roleEntity")
    private RoleUserEntity roleUserEntity;

}
