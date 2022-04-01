package com.example.demo01.controller;

import com.example.demo01.entity.TbUser;
import com.example.demo01.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class LoginController {

    //将Service注入Web层
    @Autowired
    private  TbUserService tbUserService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value="/loginIn",method= RequestMethod.POST)
    public String login(String account,String password){
        TbUser tbUser = tbUserService.loginIn(account,password);
        if (tbUser!=null){
            return "success";
        }else{
            return "error";
        }
    }

}
