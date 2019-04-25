package com.nwx.controller.admin;

import com.nwx.common.DataTable;
import com.nwx.entity.admin.SysUser;
import com.nwx.service.admin.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version : V1.font-awesome
 * @Description: 用户管理
 * @Auther: Neil
 * @Date: 2019/4/23 17:37
 */
@RestController
@RequestMapping("/admin/user")
public class SysUserController {

    @Autowired
    private SysUserService userService;

    @RequestMapping("/index")
    public String index(){

        return "";
    }

    @RequestMapping("/test")
    public DataTable test(){
//        IPage<SysUser> page = userService.page(new Page<SysUser>(1, 10), new QueryWrapper<>());
//        return new DataTable(page.getTotal(), page.getRecords());

        List<SysUser> userList = userService.getUserList();

        return new DataTable(1L, userList);
    }
}
