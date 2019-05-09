package com.nwx.service.admin.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nwx.mapper.admin.SysUserMapper;
import com.nwx.entity.admin.SysUser;
import com.nwx.service.admin.SysUserService;
import com.nwx.vo.QueryUser;
import com.nwx.vo.SaveUserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @version : V1.font-awesome
 * @Description: 用户管理
 * @Auther: Neil
 * @Date: 2019/4/23 17:30
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysUserMapper userMapper;


    @Override
    public IPage<SysUser> getUserPage(QueryUser queryUser) {

        SysUser sysUser = new SysUser();
        BeanUtils.copyProperties(queryUser, sysUser);

        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();

        IPage<SysUser> userList = userMapper.selectPage(new Page<SysUser>(queryUser.getPage(), queryUser.getLimit()), queryWrapper);

        return userList;
    }

    @Override
    @Transactional
    public int saveUser(SaveUserVo saveUserVo) {

        String userId = saveUserVo.getUserId();
        int token = 0;
        if(userId != null){
            token = userMapper.updateById(saveUserVo);
        }else{
            token = userMapper.insert(saveUserVo);
        }

        String[] roleIds = saveUserVo.getRoleIds().split(",");

        //保存用户和角色的关系

        return token;
    }
}
