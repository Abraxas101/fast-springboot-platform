package com.nwx.service.admin;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nwx.entity.admin.SysUser;

import java.util.List;

public interface SysUserService extends IService<SysUser> {


    List<SysUser> getUserList();
}
