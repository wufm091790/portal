package com.wfm.portaldao.entity;


public class SysRolePermission {

  private String id;
  private String sysRoleId;
  private String sysPermissionId;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getSysRoleId() {
    return sysRoleId;
  }

  public void setSysRoleId(String sysRoleId) {
    this.sysRoleId = sysRoleId;
  }


  public String getSysPermissionId() {
    return sysPermissionId;
  }

  public void setSysPermissionId(String sysPermissionId) {
    this.sysPermissionId = sysPermissionId;
  }

}
