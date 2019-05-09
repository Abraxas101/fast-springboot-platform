package com.nwx.service.admin;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nwx.entity.admin.SysUser;
import com.nwx.vo.QueryUser;
import com.nwx.vo.SaveUserVo;


public interface SysUserService {

    IPage<SysUser> getUserPage(QueryUser queryUser);

    int saveUser(SaveUserVo saveUserVo);
}
