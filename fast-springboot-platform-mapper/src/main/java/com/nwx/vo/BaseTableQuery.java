package com.nwx.vo;

/**
 * @version : V1.0
 * @Description: 列表的通用查询条件
 * @Auther: Neil
 * @Date: 2019/5/8 15:02
 */
public class BaseTableQuery {

    private int page;

    private int limit;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
