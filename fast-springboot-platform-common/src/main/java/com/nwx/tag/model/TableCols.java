package com.nwx.tag.model;

import com.alibaba.fastjson.JSONObject;
import com.nwx.execption.SystemException;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;

/**
 * @version : V1.0
 * @Description: 表格字段信息
 * @Auther: Neil
 * @Date: 2019/4/25 11:21
 */
public class TableCols {

    private String field;
    private String title;
    private String width;
    private Integer minWidth;
    private String type;
    private Boolean LAY_CHECKED;
    private String fixed;
    private Boolean sort;
    private Boolean unresize;
    private String edit;
    private String event;
    private String style;
    private String align;
    private Integer colspan;
    private Integer rowspan;
    private String templet;
    private String toolbar;

    public TableCols() {
    }

    public TableCols(String json) {
        this(JSONObject.parseObject(json));
    }

    public TableCols(JSONObject json) {
        Set<String> key = json.keySet();
        Iterator iterator = key.iterator();

        while(iterator.hasNext()) {
            String next = (String)iterator.next();
            Field[] fields = this.getClass().getDeclaredFields();

            for(int i = 0; i < fields.length; ++i) {
                fields[i].setAccessible(true);

                try {
                    if (fields[i].getName().equals(next)) {
                        if (fields[i].getType().getName().equals("java.lang.String")) {
                            fields[i].set(this, json.getString(next));
                        } else if (fields[i].getType().getName().equals("java.lang.Integer")) {
                            fields[i].set(this, json.getInteger(next));
                        } else if (fields[i].getType().getName().equals("java.lang.Boolean")) {
                            fields[i].set(this, json.getBoolean(next));
                        }
                    }
                } catch (Exception var8) {
                    throw new SystemException("表格组件信息异常");
                }
            }
        }

    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWidth() {
        return this.width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public Integer getMinWidth() {
        return this.minWidth;
    }

    public void setMinWidth(Integer minWidth) {
        this.minWidth = minWidth;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getLAY_CHECKED() {
        return this.LAY_CHECKED;
    }

    public void setLAY_CHECKED(Boolean lAY_CHECKED) {
        this.LAY_CHECKED = lAY_CHECKED;
    }

    public String getFixed() {
        return this.fixed;
    }

    public void setFixed(String fixed) {
        this.fixed = fixed;
    }

    public Boolean getSort() {
        return this.sort;
    }

    public void setSort(Boolean sort) {
        this.sort = sort;
    }

    public Boolean getUnresize() {
        return this.unresize;
    }

    public void setUnresize(Boolean unresize) {
        this.unresize = unresize;
    }

    public String getEdit() {
        return this.edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public String getEvent() {
        return this.event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getAlign() {
        return this.align;
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public Integer getColspan() {
        return this.colspan;
    }

    public void setColspan(Integer colspan) {
        this.colspan = colspan;
    }

    public Integer getRowspan() {
        return this.rowspan;
    }

    public void setRowspan(Integer rowspan) {
        this.rowspan = rowspan;
    }

    public String getTemplet() {
        return this.templet;
    }

    public void setTemplet(String templet) {
        this.templet = templet;
    }

    public String getToolbar() {
        return this.toolbar;
    }

    public void setToolbar(String toolbar) {
        this.toolbar = toolbar;
    }
}
