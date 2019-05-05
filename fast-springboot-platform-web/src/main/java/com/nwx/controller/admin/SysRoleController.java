package com.nwx.controller.admin;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nwx.common.DataTable;
import com.nwx.entity.admin.SysRole;
import com.nwx.entity.admin.SysUser;
import com.nwx.entity.common.SysLayuiTableCols;
import com.nwx.entity.common.SysLayuiTableConfig;
import com.nwx.service.admin.SysRoleService;
import com.nwx.service.common.SysLayuiTableColsService;
import com.nwx.service.common.SysLayuiTableConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @version : V1.0
 * @Description: 角色管理
 * @Auther: Neil
 * @Date: 2019/5/5 16:58
 */
@Controller
@RequestMapping("/admin/role")
public class SysRoleController {

    private final String TABLE_CODE = "role";

    @Autowired
    private SysRoleService roleService;

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

        return "system/role/index.html";
    }

    @RequestMapping("/tableData")
    @ResponseBody
    public DataTable tableData(HttpServletRequest request){
        int page = Integer.parseInt(request.getParameter("page"));
        int limit = Integer.parseInt(request.getParameter("limit"));

        IPage<SysRole> pageInfo = roleService.page(new Page<SysRole>(page, limit), new QueryWrapper<>());
        return new DataTable(pageInfo.getTotal(), pageInfo.getRecords());
    }
}
