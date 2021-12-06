package com.account.controller;

import com.account.entity.Account;
import com.account.repository.AdminRepository;
import com.account.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: AccountHandler
 * @description:
 * @author： 李旺旺
 * @date： 2021/11/25 10:05 上午
 */
@RestController
@RequestMapping("/account")
public class AccountHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AdminRepository adminRepository;

    @RequestMapping("getPort")
    public String getPort(){
        return "port:"+this.port;
    }

    @GetMapping("/login/{username}/{password}/{type}")
    public Account login(@PathVariable("username") String username, @PathVariable("password") String password, @PathVariable("type") String type){
        Account account = null;
        switch (type){
            case "user":
                account = userRepository.login(username, password);
                break;
            case "admin":
                account = adminRepository.login(username, password);
                break;
        }
        return account;
    }
}

