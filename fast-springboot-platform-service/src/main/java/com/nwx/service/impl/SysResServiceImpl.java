package com.nwx.service.impl;

import com.nwx.mapper.admin.SysResMapper;
import com.nwx.service.SysResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version : V1.0
 * @Description: 资源管理
 * @Auther: Neil
 * @Date: 2019/4/23 17:32
 */
@Service
public class SysResServiceImpl implements SysResService {

    @Autowired
    private SysResMapper resMapper;
}
