package com.example.controller;

import com.example.entity.GsDict;
import com.example.mapper.GsDictMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gsDict")
@RequiredArgsConstructor
public class GsDictController {

  private final GsDictMapper gsDictMapper;


  // 查询所有数据
  @GetMapping("/findAll")
  public List<GsDict> findAll() {
    return gsDictMapper.findAll();
  }
}
