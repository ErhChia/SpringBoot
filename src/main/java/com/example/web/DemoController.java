package com.example.web;

import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {
    @Resource
    private UserService userService;

    @GetMapping("users")
    public List<User> findAll() {
        return userService.findAll();
    }
//    @GetMapping("{id}")
//    public User findOne(@PathVariable("id") String id){
//
//    }
//    @PostMapping
//    public User insert(User user){
//
//    }
//    @DeleteMapping("{id}")
//    public void delete(@PathVariable("id") String id){
//
//    }
}
