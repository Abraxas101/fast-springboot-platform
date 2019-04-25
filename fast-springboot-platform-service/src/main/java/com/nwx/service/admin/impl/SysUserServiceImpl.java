package com.nwx.service.admin.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nwx.mapper.admin.SysUserMapper;
import com.nwx.entity.admin.SysUser;
import com.nwx.service.admin.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version : V1.font-awesome
 * @Description: 用户管理
 * @Auther: Neil
 * @Date: 2019/4/23 17:30
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysUserMapper userMapper;

    public List<SysUser> getUserList(){
        return userMapper.getUserList();
    }

}
