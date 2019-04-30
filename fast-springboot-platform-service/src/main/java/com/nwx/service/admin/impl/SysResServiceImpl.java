package com.nwx.service.admin.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nwx.entity.admin.SysRes;
import com.nwx.mapper.admin.SysResMapper;
import com.nwx.service.admin.SysResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<SysRes> getNavBars(String userId) {

        List<SysRes> sysRes = resMapper.selectList(null);

        return sysRes;
    }
}
