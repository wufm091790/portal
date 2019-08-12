package com.wfm.portalservice.impl;

import com.wfm.portaldao.entity.SysUser;
import com.wfm.portaldao.mapper.SysUserMapper;
import com.wfm.portalservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: portal
 * @description:
 * @author: wfm
 * @create: 2019-08-08 22:42
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    SysUserMapper sysUserMapper;

    public List<SysUser> findAll() {
        return sysUserMapper.selectAll();
    }

    public String test() {
        return "hello";
    }
}
