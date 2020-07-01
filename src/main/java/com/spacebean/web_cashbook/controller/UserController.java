package com.spacebean.web_cashbook.controller;

import com.spacebean.web_cashbook.command.MemberVO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @PostMapping(value="/joinform")
  @ResponseBody
  public String joinForm(@RequestBody MemberVO vo) {

    return null;
  }
}
