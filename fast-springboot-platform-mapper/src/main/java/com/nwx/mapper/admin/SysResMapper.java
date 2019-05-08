package com.nwx.mapper.admin;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nwx.cache.MybatisRedisCache;
import com.nwx.entity.admin.SysRes;
import org.apache.ibatis.annotations.CacheNamespace;

import java.util.List;
import java.util.Map;

@CacheNamespace(implementation= MybatisRedisCache.class,eviction=MybatisRedisCache.class)
public interface SysResMapper extends BaseMapper<SysRes> {

    List<SysRes> getOneNavBars(Map<String, Object> queryMap);

    List<SysRes> getResChildList(Map<String, Object> queryMap);

    List<Map<String,Object>> getResTreeList(Map<String, Object> queryMap);
}
