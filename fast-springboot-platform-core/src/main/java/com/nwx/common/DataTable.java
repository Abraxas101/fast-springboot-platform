package com.nwx.common;

import java.util.List;

/**
 * @version : V1.0
 * @Description: layui数据表格结果类
 * @Auther: Neil
 * @Date: 2019/4/25 9:28
 */
public class DataTable<T> {

    private int code = 0;
    private String msg;
    private Long count;
    private List<T> data;

    public DataTable(Long count, List<T> data){
        this.count = count;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
