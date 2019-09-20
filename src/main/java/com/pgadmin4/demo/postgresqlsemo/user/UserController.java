package com.pgadmin4.demo.postgresqlsemo.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserServices service;

    public UserController(UserServices service){
        this.service = service;
        this.service = this.service;
    }

    @GetMapping("/all")
    public List<UserEntity> getAllUsers(){
        return this.service.getAllUsers();
    }

    @GetMapping("/id/{id}")
    public UserEntity getUserEntityById(@PathVariable int id){
        return this.service.getById(id);
    }

    @DeleteMapping("/delete/id/{id}")
    public UserEntity deleteUserEntityById(@PathVariable int id){
        return this.service.deleteById(id);
    }

    @PostMapping("/save")
    public UserEntity saveUserEntity(@RequestBody UserEntity userEntity){
        return this.service.saveUserEnitity(userEntity);
    }

    @PutMapping("/update/id/{id}")
    public UserEntity saveOrUpdateUserEntity(@PathVariable int id, @RequestBody UserEntity userEntity){
        return this.service.saveOrUpdateUserEntity(id, userEntity);
    }
}
