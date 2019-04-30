package com.nwx.tag.model;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @version : V1.0
 * @Description: 表格
 * @Auther: Neil
 * @Date: 2019/4/25 11:21
 */
public class Table {

    private String elem;
    private String url;
    private List<TableCols> cols;
    private String width;
    private String height;
    private Integer cellMinWidth = 80;
    private Boolean page = false;
    private Integer limit = 20;
    private Integer[] limits = new Integer[]{20, 40, 60, 80, 100};
    private Boolean loading = true;
    private String text;
    private String initSort;
    private String skin;
    private Boolean even;
    private String size;
    private String done;
    private String cssClass;
    private boolean treeTable = false;
    private String tag;

    public Table(JSONObject json) {
        Set<String> key = json.keySet();
        List<TableCols> list = new ArrayList();
        Iterator iterator = key.iterator();

        while(iterator.hasNext()) {
            String next = (String)iterator.next();
            TableCols col = new TableCols();
            col.setField(next);
            col.setTitle(json.getString(next));
            list.add(col);
        }

        this.setCols(list);
    }

    public Table() {
    }

    public static Table me() {
        return new Table();
    }

    public String getElem() {
        return this.elem;
    }

    public void setElem(String elem) {
        this.elem = elem;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<TableCols> getCols() {
        return this.cols;
    }

    public void setCols(List<TableCols> cols) {
        this.cols = cols;
    }

    public String getWidth() {
        return this.width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return this.height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Integer getCellMinWidth() {
        return this.cellMinWidth;
    }

    public void setCellMinWidth(Integer cellMinWidth) {
        this.cellMinWidth = cellMinWidth;
    }

    public Boolean getPage() {
        return this.page;
    }

    public void setPage(Boolean page) {
        this.page = page;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer[] getLimits() {
        return this.limits;
    }

    public void setLimits(Integer[] limits) {
        this.limits = limits;
    }

    public Boolean getLoading() {
        return this.loading;
    }

    public void setLoading(Boolean loading) {
        this.loading = loading;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getInitSort() {
        return this.initSort;
    }

    public void setInitSort(String initSort) {
        this.initSort = initSort;
    }

    public String getSkin() {
        return this.skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public Boolean getEven() {
        return this.even;
    }

    public void setEven(Boolean even) {
        this.even = even;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDone() {
        return this.done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public String getCssClass() {
        return this.cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public boolean isTreeTable() {
        return this.treeTable;
    }

    public void setTreeTable(boolean treeTable) {
        this.treeTable = treeTable;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
