package com.wfm.portaldao.entity;


public class SysUserRole {

  private String id;
  private String sysUserId;
  private String sysRoleId;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getSysUserId() {
    return sysUserId;
  }

  public void setSysUserId(String sysUserId) {
    this.sysUserId = sysUserId;
  }


  public String getSysRoleId() {
    return sysRoleId;
  }

  public void setSysRoleId(String sysRoleId) {
    this.sysRoleId = sysRoleId;
  }

}
