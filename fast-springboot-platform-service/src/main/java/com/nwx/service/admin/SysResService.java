package com.nwx.service.admin;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nwx.entity.admin.SysRes;

import java.util.List;
import java.util.Map;

public interface SysResService extends IService<SysRes> {

    List<SysRes> getNavBars(Map<String, Object> queryMap);
}
