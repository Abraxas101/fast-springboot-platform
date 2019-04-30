package com.nwx.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nwx.common.NavbarBuilder;
import com.nwx.entity.admin.SysRes;
import com.nwx.service.admin.SysResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @version : V1.0
 * @Description: 系统资源管理
 * @Auther: Neil
 * @Date: 2019/4/30 10:29
 */
@Controller
@RequestMapping("/admin/res")
public class SysResController {

    @Autowired
    private SysResService sysResService;

    @RequestMapping("/getNavBar")
    @ResponseBody
    public List<NavbarBuilder.Navbar> getNavBar(){

        String userId = "1";

        List<SysRes> resList = sysResService.getNavBars(userId);

        List<NavbarBuilder.Navbar> navbars = new ArrayList<NavbarBuilder.Navbar>();
        for (SysRes sysRes : resList){
            NavbarBuilder.Navbar navbar = new NavbarBuilder.Navbar(
                    sysRes.getResId(),
                    sysRes.getParResId(),
                    sysRes.getResName(),
                    sysRes.getResIcon(),
                    sysRes.getResUrl()
            );

            navbars.add(navbar);
        }

        return new NavbarBuilder(navbars).buildTree();

    }
}
