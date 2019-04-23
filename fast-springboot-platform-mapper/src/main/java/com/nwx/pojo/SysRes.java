package com.nwx.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * @version : V1.font-awesome
 * @Description: 系统资源
 * @Auther: Neil
 * @Date: 2019/4/23 17:25
 */
@TableName("SYS_USER")
public class SysRes implements Serializable {

    @TableId("RES_ID")
    private String resId;
    private String resCode;
    private String parResId;
    private String resName;
    private String resIcon;
    private String resUrl;
    private Integer resOrder;
    private String tips;
    private Integer status;
    private String createUser;
    private Date createTime;
    private String modifyUser;
    private Date modifyTime;
    private Integer resLevels;

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getParResId() {
        return parResId;
    }

    public void setParResId(String parResId) {
        this.parResId = parResId;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getResIcon() {
        return resIcon;
    }

    public void setResIcon(String resIcon) {
        this.resIcon = resIcon;
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl;
    }

    public Integer getResOrder() {
        return resOrder;
    }

    public void setResOrder(Integer resOrder) {
        this.resOrder = resOrder;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getResLevels() {
        return resLevels;
    }

    public void setResLevels(Integer resLevels) {
        this.resLevels = resLevels;
    }

    @Override
    public String toString() {
        return "SysRes{" +
                "resId='" + resId + '\'' +
                ", resCode='" + resCode + '\'' +
                ", parResId='" + parResId + '\'' +
                ", resName='" + resName + '\'' +
                ", resIcon='" + resIcon + '\'' +
                ", resUrl='" + resUrl + '\'' +
                ", resOrder=" + resOrder +
                ", tips='" + tips + '\'' +
                ", status=" + status +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", modifyUser='" + modifyUser + '\'' +
                ", modifyTime=" + modifyTime +
                ", resLevels=" + resLevels +
                '}';
    }
}
