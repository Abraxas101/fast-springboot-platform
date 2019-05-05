package com.nwx.mapper.admin;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nwx.entity.admin.SysRes;

import java.util.List;
import java.util.Map;

public interface SysResMapper extends BaseMapper<SysRes> {

    List<SysRes> getOneNavBars(Map<String, Object> queryMap);

    List<SysRes> getResChildList(Map<String, Object> queryMap);

    List<Map<String,Object>> getResTreeList(Map<String, Object> queryMap);
}
