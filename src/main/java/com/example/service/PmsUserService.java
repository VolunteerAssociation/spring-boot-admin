package com.example.service;

import com.example.entity.PmsUser;
import com.example.mapper.PmsUserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PmsUserService {

  private final PmsUserMapper pmsUserMapper;

  public int save(PmsUser pmsUser) {
    if (pmsUser.getId() == null) {
      return pmsUserMapper.insert(pmsUser);
    } else {
      return pmsUserMapper.update(pmsUser);
    }
  }
}
