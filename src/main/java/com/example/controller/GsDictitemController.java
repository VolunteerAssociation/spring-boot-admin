package com.example.controller;

import com.example.entity.GsDictitem;
import com.example.mapper.GsDictitemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gsDictitem")
@RequiredArgsConstructor
public class GsDictitemController {

  private final GsDictitemMapper gsDictitemMapper;

  // 查询所有数据
  @GetMapping("/findAll")
  public List<GsDictitem> findAll() {
    return gsDictitemMapper.findAll();
  }

}
