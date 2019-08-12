package com.wfm.portaldao.mapper;

import com.wfm.portaldao.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SysUserMapper {
    List<SysUser> selectAll();
}
