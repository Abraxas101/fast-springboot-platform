package com.nwx.service.impl;

import com.nwx.mapper.admin.SysUserMapper;
import com.nwx.pojo.SysUser;
import com.nwx.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version : V1.font-awesome
 * @Description: 用户管理
 * @Auther: Neil
 * @Date: 2019/4/23 17:30
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper userMapper;

    @Override
    public SysUser findById(String userId) {
        SysUser sysUser = userMapper.selectById(userId);

        return sysUser;
    }
}
