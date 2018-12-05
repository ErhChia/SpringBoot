package com.example.web;

import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/jack")
public class MyController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        return "hello.html";
    }

    @GetMapping("users")
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }
}
