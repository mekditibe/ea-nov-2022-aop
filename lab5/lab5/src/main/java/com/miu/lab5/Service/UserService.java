package com.miu.lab5.Service;


import com.miu.lab5.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {
    List<User> getAllUser();
    User getUser(Long Id);
    void deleteUser(Long Id);
    void saveUser(User user);
    void updateUser(User user);
}
