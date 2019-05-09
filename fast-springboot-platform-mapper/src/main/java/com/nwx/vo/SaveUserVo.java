package com.nwx.vo;

import com.nwx.entity.admin.SysUser;

/**
 * @version : V1.0
 * @Description: 用户保存实体类
 * @Auther: Neil
 * @Date: 2019/5/8 19:25
 */
public class SaveUserVo extends SysUser {

    private String roleIds;


    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }
}
