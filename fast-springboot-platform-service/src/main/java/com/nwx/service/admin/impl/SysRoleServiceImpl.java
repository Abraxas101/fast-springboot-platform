package com.nwx.service.admin.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nwx.entity.admin.SysRole;
import com.nwx.mapper.admin.SysRoleMapper;
import com.nwx.service.admin.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version : V1.font-awesome
 * @Description: 角色管理
 * @Auther: Neil
 * @Date: 2019/4/23 17:31
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Autowired
    private SysRoleMapper roleMapper;
}
