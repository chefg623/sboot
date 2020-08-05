package com.chefg.sboot.service;

import com.chefg.sboot.pojo.user;

public interface userService {
    boolean isExist(String username);

    user getByName(String username);

    user get(String username, String password);

    void add(user user);





}
