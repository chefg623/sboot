package com.chefg.sboot.service;

import com.chefg.sboot.dao.userMapper;
import com.chefg.sboot.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {
    @Autowired
    private userMapper userMapper;

    public boolean isExist(String username) {
        user user=getByName(username);
        return null!=user;
    }

    public user getByName(String username) {
        return userMapper.findByUsername(username);
    }

    public user get(String username, String password){
        return userMapper.getByUsernameAndPassword(username, password);
    }

    public void add(user user) {
        userMapper.save(user);
    }

}
