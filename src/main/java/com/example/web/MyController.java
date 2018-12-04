package com.example.web;

import com.example.bean.User;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/jack")
public class MyController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String homePage(){
        return "hello.html";
    }

    @RequestMapping(value = "page", method = RequestMethod.GET)
    @ResponseBody
    public List<User> page(){
        return userService.findAll();
    }
    @RequestMapping(value = "print")
    public String print(@RequestParam("test")String test){
        System.out.println(test);
        return "hello.html";
    }
}
