package com.tck.dao;

import java.util.List;

import com.tck.util.MyBatisRepository;
import com.tck.entity.Power;
import com.tck.entity.User;

@MyBatisRepository
public interface PowerDao {
    List<Power> findAll();
    User findById(String  userid);
}
