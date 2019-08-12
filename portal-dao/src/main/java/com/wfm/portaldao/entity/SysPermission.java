package com.wfm.portaldao.entity;


public class SysPermission {

  private long id;
  private String name;
  private String type;
  private String url;
  private String percode;
  private long parentid;
  private String parentids;
  private String sortstring;
  private String available;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public String getPercode() {
    return percode;
  }

  public void setPercode(String percode) {
    this.percode = percode;
  }


  public long getParentid() {
    return parentid;
  }

  public void setParentid(long parentid) {
    this.parentid = parentid;
  }


  public String getParentids() {
    return parentids;
  }

  public void setParentids(String parentids) {
    this.parentids = parentids;
  }


  public String getSortstring() {
    return sortstring;
  }

  public void setSortstring(String sortstring) {
    this.sortstring = sortstring;
  }


  public String getAvailable() {
    return available;
  }

  public void setAvailable(String available) {
    this.available = available;
  }

}
