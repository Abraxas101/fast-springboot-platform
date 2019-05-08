package com.nwx.controller.admin;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nwx.common.DataTable;
import com.nwx.entity.admin.SysUser;
import com.nwx.entity.common.SysLayuiTableCols;
import com.nwx.entity.common.SysLayuiTableConfig;
import com.nwx.service.admin.SysUserService;
import com.nwx.service.common.SysLayuiTableColsService;
import com.nwx.service.common.SysLayuiTableConfigService;
import com.nwx.vo.QueryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @version : V1.font-awesome
 * @Description: 用户管理
 * @Auther: Neil
 * @Date: 2019/4/23 17:37
 */
@Controller
@RequestMapping("/admin/user")
public class SysUserController {

    private final String TABLE_CODE = "user";

    @Autowired
    private SysUserService userService;

    @Autowired
    private SysLayuiTableConfigService layuiTableService;
    @Autowired
    private SysLayuiTableColsService layuiTableColsService;

    @RequestMapping("/index")
    public String index(HttpServletRequest request){

        List<SysLayuiTableCols> listCol = this.layuiTableColsService.findColsByTableCode(TABLE_CODE);
        SysLayuiTableConfig config = this.layuiTableService.findByCode(TABLE_CODE);
        config.setCols(listCol);
        request.setAttribute("config", JSON.toJSONString(config));

        return "system/user/index.html";
    }

    @RequestMapping("/tableData")
    @ResponseBody
    public DataTable tableData(QueryUser queryUser){

        IPage<SysUser> pageInfo = userService.getUserPage(queryUser);
        return new DataTable(pageInfo.getTotal(), pageInfo.getRecords());
    }

    @RequestMapping("/toSaveUI")
    public String toSaveUI(){

        return "system/user/save.html";
    }
}
