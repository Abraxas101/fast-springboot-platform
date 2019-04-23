package com.nwx.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version : V1.0
 * @Description: 用户管理
 * @Auther: Neil
 * @Date: 2019/4/23 17:37
 */
@RestController
@RequestMapping("/admin/user")
public class SysUserController {


    @RequestMapping("/test")
    public String test(){


        return "hello spring boot";
    }
}
