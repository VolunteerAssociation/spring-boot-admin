package com.example.entity;

import lombok.Data;

@Data
public class PmsUser {

  private Integer id;
  private String loginName;
  private String nickName;
  private String password;
  private String mobile;
  private Integer sex;
  private Integer enable;
  private String lastLoginIp;
  private String lastLoginTime;
  private String creater;
  private String createrId;
  private String operator;
  private String operatorId;
  private String certificateType;
  private String certificateCode;
  private Integer isAllowMulti;
  private String createdAt;
  private String updatedAt;

}
