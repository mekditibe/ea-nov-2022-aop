package com.miu.lab5.Controller;

import com.miu.lab5.Entity.User;
import com.miu.lab5.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/{Id}")
    public User getUser(@PathVariable Long Id){
        return userService.getUser(Id);
    }

    @DeleteMapping("/{Id}")
    public void deleteUser(@PathVariable Long Id){
        userService.deleteUser(Id);
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @PutMapping
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

}
