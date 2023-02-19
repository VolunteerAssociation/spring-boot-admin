package com.example.mapper;

import com.example.entity.GsDictitem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GsDictitemMapper {

  // 查询
  @Select("select  * from gs_dictitem")
  List<GsDictitem> findAll();

  int update(GsDictitem gsDictitem);
}
