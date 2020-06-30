package com.spacebean.web_cashbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @GetMapping(value={"/","/join"})
  public String entry() {
    return "index";
  }
}
