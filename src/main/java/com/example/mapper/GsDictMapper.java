package com.example.mapper;

import com.example.entity.GsDict;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GsDictMapper {

  // 查询
  @Select("select  * from gs_dict")
  List<GsDict> findAll();

  int update(GsDict gsDict);
}
