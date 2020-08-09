package com.chefg.sboot.controller;

import com.chefg.sboot.pojo.user;
import com.chefg.sboot.result.Result;
import com.chefg.sboot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@Controller
public class LoginController {

    @Autowired
    userService userService;

    @CrossOrigin
    @PostMapping("api/login")
    @ResponseBody
    public Result login(@RequestBody user resquestuser){
        String username=resquestuser.getUsername();
        username= HtmlUtils.htmlEscape(username);  //对html标签进行转义

        if (!Objects.equals("admin", username) || !Objects.equals("123456", resquestuser.getPassword())) {
            String message = "账号密码错误";
            System.out.println("test");
            return new Result(400);
        } else {
            return new Result(200);
        }
    }
}
