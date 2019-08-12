package com.wfm.portalweb.controller;


import com.wfm.portaldao.entity.SysUser;
import com.wfm.portalservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: portal
 * @description: user controller
 * @author: wfm
 * @create: 2019-08-08 13:31
 **/

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users")
    public List<SysUser> users() {
        return userService.findAll();
    }

    @RequestMapping(value = "/test")
    public String test() {
        return userService.test();
    }

}
