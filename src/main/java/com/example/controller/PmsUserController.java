package com.example.controller;

import com.example.entity.PmsUser;
import com.example.mapper.PmsUserMapper;
import com.example.service.PmsUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pmsUser")
@RequiredArgsConstructor
public class PmsUserController {

  private final PmsUserMapper pmsUserMapper;
  private final PmsUserService pmsUserService;

  // 新增和修改
  @PostMapping("/insert")
  public Integer setPmsUser(@RequestBody PmsUser pmsUser) {
    return pmsUserService.save(pmsUser);
  }

  // 删除数据
  @DeleteMapping("/delete/{id}")
  public Integer delete(@PathVariable Integer id) {
    return pmsUserMapper.deleteById(id);
  }

  // 查询所有数据
  @GetMapping("/findAll")
  public List<PmsUser> findAll() {
    return pmsUserMapper.findAll();
  }


}
