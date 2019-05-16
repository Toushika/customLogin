package com.enigma.dev.repositories;

import com.enigma.dev.entity.RoleEntity;
import com.enigma.dev.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoleRepository extends CrudRepository<RoleEntity,Integer> {
    @Query("select u from RoleEntity u where u.roleName =:roleName")
     RoleEntity findByRoleName(@Param("roleName") String roleName);
}
