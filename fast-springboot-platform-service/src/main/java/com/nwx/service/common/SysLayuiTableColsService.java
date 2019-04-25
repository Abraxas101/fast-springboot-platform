package com.nwx.service.common;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nwx.entity.common.SysLayuiTableCols;

import java.util.List;

public interface SysLayuiTableColsService extends IService<SysLayuiTableCols> {
    List<SysLayuiTableCols> findColsByTableCode(String user);
}
