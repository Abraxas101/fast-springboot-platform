package com.nwx.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * @version : V1.0
 * @Description: 用户
 * @Auther: Neil
 * @Date: 2019/4/23 17:16
 */
@TableName("SYS_USER")
public class SysUser implements Serializable {

    @TableId("USER_ID")
    private String userId;

    private String loginName;

    private String userName;

    private String avatar;

    private String password;

    private Integer sex;

    private String deptId;

    private String email;

    private String mobilePhone;

    private String phone;

    private Integer status;

    private Integer onlineStatus;

    private String createUser;

    private Date createTime;

    private String modifyUser;

    private Date modifyTime;

    private String sysSalt;

    private Integer type;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getSysSalt() {
        return sysSalt;
    }

    public void setSysSalt(String sysSalt) {
        this.sysSalt = sysSalt;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "userId='" + userId + '\'' +
                ", loginName='" + loginName + '\'' +
                ", userName='" + userName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", deptId='" + deptId + '\'' +
                ", email='" + email + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                ", onlineStatus=" + onlineStatus +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", modifyUser='" + modifyUser + '\'' +
                ", modifyTime=" + modifyTime +
                ", sysSalt='" + sysSalt + '\'' +
                ", type=" + type +
                '}';
    }
}
