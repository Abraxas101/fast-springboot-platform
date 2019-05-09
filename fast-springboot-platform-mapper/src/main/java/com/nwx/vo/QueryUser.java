package com.nwx.vo;

/**
 * @version : V1.0
 * @Description: 用户的查询条件
 * @Auther: Neil
 * @Date: 2019/5/8 15:02
 */
public class QueryUser extends BaseTableQuery{

    private String userNmae;

    public String getUserNmae() {
        return userNmae;
    }

    public void setUserNmae(String userNmae) {
        this.userNmae = userNmae;
    }
}
