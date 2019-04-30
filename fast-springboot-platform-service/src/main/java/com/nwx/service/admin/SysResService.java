package com.nwx.service.admin;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nwx.entity.admin.SysRes;

import java.util.List;

public interface SysResService extends IService<SysRes> {

    List<SysRes> getNavBars(String userId);
}
