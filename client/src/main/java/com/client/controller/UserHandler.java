package com.client.controller;

import com.client.entity.User;
import com.client.entity.UserVO;
import com.client.feign.OrderFeign;
import com.client.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private UserFeign userFeign;
    @Autowired
    private OrderFeign orderFeign;

    @RequestMapping("getPort")
    public String getPort(){
        return "port:"+this.port;
    }

    @GetMapping("/findAll")
    @ResponseBody
    public UserVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){
        return userFeign.findAll(page, limit);
    }

    @PostMapping("/save")
    public String save(User user){
        userFeign.save(user);
        return "redirect:/account/redirect/user_manage";
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
        orderFeign.deleteByUid(id);
        userFeign.deleteById(id);
        return "redirect:/account/redirect/user_manage";
    }
}
