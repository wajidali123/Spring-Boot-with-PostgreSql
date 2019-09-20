package com.pgadmin4.demo.postgresqlsemo.user;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {

    private UserRepo userRepo;

    public UserServices(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public List<UserEntity> getAllUsers(){
        /*List<UserEntity> users = new ArrayList<>();
          for(int i=1; i<= 20; i++){
            UserEntity user1 = new UserEntity(1,"LName_"+i,"FName_"+i);
            users.add(user1);
        }

        users.forEach((user)->{
            this.userRepo.save(user);
        });*/

        return this.userRepo.findAll();
    }

    public UserEntity getById(int id){
        return this.userRepo.getOne(id);
    }

    public UserEntity deleteById(int id){
        UserEntity userEntity = this.userRepo.getOne(id);
        if(userEntity != null){
            this.userRepo.deleteById(id);
            return userEntity;
        }
        else {
            throw new CustomException("Can not find user with id: "+ id);
        }
    }

    public UserEntity saveUserEnitity(UserEntity userEntity){
        return this.userRepo.save(userEntity);
    }

    public UserEntity saveOrUpdateUserEntity(int id, UserEntity userEntity){
        UserEntity userEntity1 = this.userRepo.getOne(id);
        if(userEntity1 != null){
            userEntity1.setFname(userEntity.getFname());
            userEntity1.setLname(userEntity.getLname());
            this.userRepo.save(userEntity1);
            return userEntity1;
        }
        else {
            throw new CustomException("Can not find userEnitity with Id: "+ id);
        }
    }

}
