package com.nwx.service.common.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nwx.entity.common.SysLayuiTableCols;
import com.nwx.mapper.common.SysLayuiTableColsMapper;
import com.nwx.service.common.SysLayuiTableColsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version : V1.0
 * @Description: layui表格字段管理
 * @Auther: Neil
 * @Date: 2019/4/25 11:00
 */
@Service
public class SysLayuiTableColsServiceImpl extends ServiceImpl<SysLayuiTableColsMapper, SysLayuiTableCols> implements SysLayuiTableColsService {

    @Autowired
    private SysLayuiTableColsMapper sysLayuiTableColsMapper;

    @Override
    public List<SysLayuiTableCols> findColsByTableCode(String tableCode) {
        return sysLayuiTableColsMapper.findColsByTableCode(tableCode);
    }
}
