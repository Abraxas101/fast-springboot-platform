package com.nwx.service.common.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nwx.cache.MybatisRedisCache;
import com.nwx.entity.common.SysLayuiTableConfig;
import com.nwx.mapper.common.SysLayuiTableConfigMapper;
import com.nwx.service.common.SysLayuiTableConfigService;
import org.apache.ibatis.annotations.CacheNamespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version : V1.0
 * @Description: layui表格配置管理
 * @Auther: Neil
 * @Date: 2019/4/25 11:03
 */
@Service
@CacheNamespace(implementation= MybatisRedisCache.class,eviction=MybatisRedisCache.class)
public class SysLayuiTableConfigServiceImpl extends ServiceImpl<SysLayuiTableConfigMapper, SysLayuiTableConfig> implements SysLayuiTableConfigService {

    @Autowired
    private SysLayuiTableConfigMapper sysLayuiTableConfigMapper;

    @Override
    public SysLayuiTableConfig findByCode(String tableCode) {
        return sysLayuiTableConfigMapper.findByCode(tableCode);
    }
}
