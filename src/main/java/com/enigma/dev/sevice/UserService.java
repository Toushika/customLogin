package com.enigma.dev.sevice;

import com.enigma.dev.entity.RoleEntity;
import com.enigma.dev.entity.RoleUserEntity;
import com.enigma.dev.entity.UserEntity;
import com.enigma.dev.model.User;
import com.enigma.dev.repositories.RoleMapRepository;
import com.enigma.dev.repositories.RoleRepository;
import com.enigma.dev.repositories.UserRepositories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserRepositories userRepositories;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private RoleMapRepository roleMapRepository;

    public void saveUserInfo(User user) {
        LOGGER.info("UserService:: saveUserInfo:: User :: " + user.toString());
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(user.getUserName());
        userEntity.setUserEmail(user.getUserEmail());
        userEntity.setUserPassword(user.getUserPassword());
        userEntity.setUserAddress(user.getUserAddress());
        userEntity.setUserGender(user.getUserGender());
        userEntity.setUserMobile(user.getUserMobile());

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String currentDate = dateFormat.format(date);
        userEntity.setCreatedTime(currentDate);
        userRepositories.save(userEntity);
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRoleName("user");
        roleEntity.setCreatedTime(currentDate);
        roleRepository.save(roleEntity);
        LOGGER.info("RoleEntity:: "+roleEntity.getId());

        RoleUserEntity roleUserEntity  = new RoleUserEntity() ;
        roleUserEntity.setRoleEntity(roleEntity);
        roleUserEntity.setUserEntity(userEntity);
        roleUserEntity.setCreatedTime(currentDate);
        roleMapRepository.save(roleUserEntity);
        LOGGER.info("UserService:: saveUserInfo:: UserEntity :: " + userEntity.toString());


    }
}
