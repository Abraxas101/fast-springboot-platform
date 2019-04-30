package com.nwx.mapper.admin;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nwx.entity.admin.SysRes;

import java.util.List;
import java.util.Map;

public interface SysResMapper extends BaseMapper<SysRes> {

    List<SysRes> getNavBars(Map<String, Object> queryMap);
}
