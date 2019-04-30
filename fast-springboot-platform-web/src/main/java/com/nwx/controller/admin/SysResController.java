package com.nwx.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nwx.common.NavbarBuilder;
import com.nwx.entity.admin.SysRes;
import com.nwx.service.admin.SysResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<NavbarBuilder.Navbar> getNavBar(HttpServletRequest request){

        String userId = "1";

        String level = request.getParameter("level");
        String pId = request.getParameter("pId");

        Map<String, Object> queryMap = new HashMap<>();
        queryMap.put("level", level);
        queryMap.put("userId", userId);
        queryMap.put("pId", pId);

        List<SysRes> resList = sysResService.getNavBars(queryMap);

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
