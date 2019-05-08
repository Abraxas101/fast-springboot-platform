package com.nwx.service.admin;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nwx.entity.admin.SysUser;
import com.nwx.vo.QueryUser;


public interface SysUserService extends IService<SysUser> {

    IPage<SysUser> getUserPage(QueryUser queryUser);
}
