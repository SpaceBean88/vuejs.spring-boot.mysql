package com.spacebean.web_cashbook.service;

import com.spacebean.web_cashbook.command.*;
import com.spacebean.web_cashbook.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;

  @Override
  public int join(MemberVO vo) {
    return userMapper.join(vo);
  }
}
