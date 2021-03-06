package com.nwx.service.admin.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nwx.entity.admin.SysRes;
import com.nwx.mapper.admin.SysResMapper;
import com.nwx.service.admin.SysResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @version : V1.font-awesome
 * @Description: 资源管理
 * @Auther: Neil
 * @Date: 2019/4/23 17:32
 */
@Service
public class SysResServiceImpl extends ServiceImpl<SysResMapper, SysRes> implements SysResService {

    @Autowired
    private SysResMapper resMapper;

    @Override
    @Cacheable(value="res",key="'getOneNavBars'")
    public List<SysRes> getOneNavBars(Map<String, Object> queryMap) {

        List<SysRes> sysRes = resMapper.getOneNavBars(queryMap);

        return sysRes;
    }

    @Override
    @Cacheable(value="res",key="'getResChildList'")
    public List<SysRes> getResChildList(Map<String, Object> queryMap) {
        List<SysRes> sysRes = resMapper.getResChildList(queryMap);

        return sysRes;
    }

    @Override
    @Cacheable(value="res",key="'getResTreeList'")
    public List<Map<String,Object>> getResTreeList(Map<String, Object> queryMap) {

        List<Map<String,Object>> sysRes = resMapper.getResTreeList(queryMap);

        return sysRes;
    }
}
