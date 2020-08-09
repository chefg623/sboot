package com.chefg.sboot;

import com.chefg.sboot.dao.userMapper;
import com.chefg.sboot.pojo.user;
import com.chefg.sboot.result.Result;
import com.chefg.sboot.service.userService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@Controller
class SbootApplicationTests {

    @Test
    void contextLoads() {

    }

}
