package com.nwx.mapper.common;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nwx.entity.common.SysLayuiTableCols;

import java.util.List;

public interface SysLayuiTableColsMapper extends BaseMapper<SysLayuiTableCols> {

    List<SysLayuiTableCols> findColsByTableCode(String tableCode);
}
