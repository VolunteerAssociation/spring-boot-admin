package com.example.mapper;

import com.example.entity.PmsUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PmsUserMapper {

  // 查询
  @Select("select  * from pms_user")
  List<PmsUser> findAll();
  // 新增
  @Insert("INSERT INTO pms_user(loginName, nickName) VALUES (#{loginName}, #{nickName})")
  int insert(PmsUser pmsUser);
  // 更新
  int update(PmsUser pmsUser);
  // 删除
  @Delete("delete from user where id = #{id}")
  Integer deleteById(@Param("id") Integer id);
}
