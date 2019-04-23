package com.nwx.service.impl;

import com.nwx.mapper.admin.SysRoleMapper;
import com.nwx.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version : V1.0
 * @Description: 角色管理
 * @Auther: Neil
 * @Date: 2019/4/23 17:31
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper roleMapper;
}
