package com.enigma.dev.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user_role_mapping")
public class RoleUserEntity {
    @Id
    @Column(name = "role_map_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id")
    private int userId ;

    @Column(name = "role_id")
    private int roleId;

    @Column(name = "created_time")
    @Size(max = 255)
    @NonNull
    private String createdTime;

}
