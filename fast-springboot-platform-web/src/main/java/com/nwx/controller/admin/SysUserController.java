package com.nwx.controller.admin;

import com.nwx.pojo.SysUser;
import com.nwx.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private SysUserService userService;

    @RequestMapping("/test")
    public String test(){

        SysUser sysUser = userService.findById("1");

        return sysUser.toString();
    }
}
