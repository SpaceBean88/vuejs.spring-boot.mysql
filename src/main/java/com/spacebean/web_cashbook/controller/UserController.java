package com.spacebean.web_cashbook.controller;

import com.spacebean.web_cashbook.command.MemberVO;
import com.spacebean.web_cashbook.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

  @Autowired
  @Qualifier("userService")
  private UserService userService;

  @PostMapping(value="/joinform")
  @ResponseBody
  public void joinForm(@RequestBody MemberVO vo) {

    int result = userService.join(vo);

    System.out.println(result);

  }
}
