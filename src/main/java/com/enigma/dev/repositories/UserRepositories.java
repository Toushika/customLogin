package com.enigma.dev.repositories;

import com.enigma.dev.entity.UserEntity;
import com.enigma.dev.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositories extends CrudRepository<UserEntity,Integer> {
}
