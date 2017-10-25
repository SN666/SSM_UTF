package com.tck.dao;

import java.util.List;

import com.tck.util.MyBatisRepository;
import com.tck.entity.User;

@MyBatisRepository
public interface UserDao {
    List<User> findAll();
    User findById(String  userid);
    void deleteById(String  userid);
    void addUser(User user);
    void updateUser(User user);
}
