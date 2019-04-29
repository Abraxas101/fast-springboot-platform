package com.nwx.tag;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSONObject;
import com.nwx.execption.SystemException;
import com.nwx.tag.model.Table;
import com.nwx.tag.model.TableCols;
import org.beetl.core.GeneralVarTagBinding;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;

/**
 * @version : V1.0
 * @Description: layui表格标签
 * @Auther: Neil
 * @Date: 2019/4/25 11:19
 */
public class TableTag extends GeneralVarTagBinding {

    Table tag = null;
    String layFilter = "";
    String ctxPath = "";

    public TableTag() {
    }

    private void init() {
        String tagName = (String) this.args[0];
        Map attrs = (Map) args[1];
        ctxPath = attrs.get("ctxPath")==null?"": (String) attrs.get("ctxPath");
        String tagconfig = attrs.get("tagconfig")==null?"": (String) attrs.get("tagconfig");
        this.layFilter = (String) attrs.get("layFilter") == null ? "" : (String) attrs.get("layFilter").toString();
        if (!"".equals(tagconfig)) {
            this.tag = JSONObject.parseObject(tagconfig, Table.class);
        }
    }

    @Override
    public void render() {
        this.init();
        StringBuffer table = new StringBuffer();
        if (this.tag != null) {
            if (this.tag.isTreeTable()) {
                table.append("").append("\n");
                table.append("");
                return;
            }

            table.append(" <table class=\"").append(this.tag.getCssClass() != null ? this.tag.getCssClass() : "layui-hide").append("\" id=\"").append(this.tag.getElem().replaceAll("#", "")).append("\" ");
            if (!StrUtil.isEmpty(this.layFilter)) {
                table.append(" lay-filter=\"").append(this.layFilter).append("\" ");
            }

            table.append(" ></table> ").append("\n");
            table.append(" <script> ").append("\n");
            table.append(" layui.use('table', function(){ ").append("\n");
            table.append(" var table = layui.table; ").append("\n");
            table.append("var tableIns = table.render({ ").append("\n");

            table.append(" elem:'").append(this.tag.getElem()).append("'").append(",").append("\n");
            String url = ctxPath + this.tag.getUrl();
            table.append(",").append(" url:'").append(url).append("'").append("\n");
            if (this.tag.getCols() != null && this.tag.getCols().size() > 0) {
                table.append(",").append(" cols: [[ ").append("\n");
                Iterator iterator = this.tag.getCols().iterator();

                while(true) {
                    if (!iterator.hasNext()) {
                        table.append(" ]]").append("\n");
                        break;
                    }

                    TableCols col = (TableCols)iterator.next();
                    table.append("{");
                    Class<? extends TableCols> cls = col.getClass();
                    Field[] fields = cls.getDeclaredFields();
                    String lastFieldName = this.getLastNotNullFieldName(fields, col);

                    for(int i = 0; i < fields.length; ++i) {
                        fields[i].setAccessible(true);

                        try {
                            if (fields[i].get(col) != null) {
                                if (fields[i].getType().getName().equals("java.lang.String")) {
                                    table.append(fields[i].getName()).append(":'").append(fields[i].get(col)).append("'").append(fields[i].getName().equals(lastFieldName) ? "" : ",");
                                } else {
                                    table.append(fields[i].getName()).append(":").append(fields[i].get(col)).append("").append(fields[i].getName().equals(lastFieldName) ? "" : ",");
                                }
                            }
                        } catch (Exception var11) {
                            throw new SystemException("表格组件信息异常");
                        }
                    }

                    table.append("}").append(iterator.hasNext() ? "," : "").append("\n");
                }
            }

            if (this.tag.getWidth() != null) {
                table.append(",").append(" width: '").append(this.tag.getWidth()).append("'").append("\n");
            }

            if (this.tag.getHeight() != null) {
                table.append(",").append(" height: '").append(this.tag.getHeight()).append("'").append("\n");
            }

            if (this.tag.getCellMinWidth() != null) {
                table.append(",").append(" cellMinWidth: ").append(this.tag.getCellMinWidth()).append("\n");
            }

            if (this.tag.getPage() != null) {
                table.append(",").append(" page: ").append(this.tag.getPage()).append("\n");
            }

            if (this.tag.getLimit() != null) {
                table.append(",").append(" limit: ").append(this.tag.getLimit()).append("\n");
            }

            if (this.tag.getLimits() != null && this.tag.getLimits().length > 0) {
                table.append(",").append(" limits: ").append(JSONUtil.toJsonStr(this.tag.getLimits())).append("\n");
            }

            if (this.tag.getSkin() != null) {
                table.append(",").append(" skin: '").append(this.tag.getSkin()).append("'").append("\n");
            }

            if (this.tag.getEven() != null) {
                table.append(",").append(" even: ").append(this.tag.getEven()).append("\n");
            }

            if (this.tag.getSize() != null) {
                table.append(",").append(" size: '").append(this.tag.getSize()).append("'").append("\n");
            }

            if (this.tag.getLoading() != null) {
                table.append(",").append(" loading: ").append(this.tag.getLoading()).append("\n");
            }

            if (StrUtil.isNotBlank(this.tag.getText())) {
                table.append(",").append(" text: {\n none: '").append(this.tag.getText()).append("'\n }").append("\n");
            }

            if (this.tag.getDone() != null) {
                table.append(",").append(" done: ").append(this.tag.getDone()).append("\n");
            }

            if (StrUtil.isNotBlank(this.tag.getInitSort())) {
                JSONObject initSort = JSONObject.parseObject(this.tag.getInitSort());
                table.append(",").append(" initSort: {\n field: '").append(initSort.get("field")).append("', \n").append(" type: '").append(initSort.get("type")).append("'  \n}").append("\n");
            }

            table.append(" }); ").append("\n");
            table.append(" }); ").append("\n");
            table.append(" </script> ").append("\n");

            try {
                this.ctx.byteWriter.writeString(table.toString());
                this.doBodyRender();
            } catch (Exception var10) {
                throw new SystemException("表格组件信息异常");
            }
        }
    }

    private String getLastNotNullFieldName(Field[] fields, Object obj) {
        String lastFieldName = "";

        for(int i = 0; i < fields.length; ++i) {
            try {
                fields[i].setAccessible(true);
                if (fields[i].get(obj) != null) {
                    lastFieldName = fields[i].getName();
                }
            } catch (Exception var6) {
                throw new SystemException("表格组件信息异常");
            }
        }

        return lastFieldName;
    }
}
