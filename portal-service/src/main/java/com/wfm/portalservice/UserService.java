package com.wfm.portalservice;

import com.wfm.portaldao.entity.SysUser;

import java.util.List;

public interface UserService {
    List<SysUser> findAll();
    String test();
}
