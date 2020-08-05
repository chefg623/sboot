package com.chefg.sboot.dao;

import com.chefg.sboot.pojo.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userMapper extends JpaRepository {

    user findByUsername(String username);

    user getByUsernameAndPassword(String username,String password);

}
