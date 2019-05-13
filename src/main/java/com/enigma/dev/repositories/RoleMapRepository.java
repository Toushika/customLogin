package com.enigma.dev.repositories;

import com.enigma.dev.entity.RoleUserEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoleMapRepository extends CrudRepository<RoleUserEntity,Integer> {
}
