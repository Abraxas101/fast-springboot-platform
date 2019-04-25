package com.nwx.mapper.common;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nwx.entity.common.SysLayuiTableConfig;

public interface SysLayuiTableConfigMapper extends BaseMapper<SysLayuiTableConfig> {

    SysLayuiTableConfig findByCode(String tableCode);
}
