package com.nwx.service.admin;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nwx.entity.admin.SysRes;

import java.util.List;
import java.util.Map;

public interface SysResService {

    List<SysRes> getOneNavBars(Map<String, Object> queryMap);

    List<SysRes> getResChildList(Map<String, Object> queryMap);

    List<Map<String,Object>> getResTreeList(Map<String, Object> queryMap);
}
