package com.nwx.service.admin;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nwx.entity.admin.SysUser;
import com.nwx.vo.QueryUser;

import java.util.List;

public interface SysUserService extends IService<SysUser> {


    List<SysUser> getUserList();

    IPage<SysUser> getUserPage(QueryUser queryUser);
}
