package com.spacebean.web_cashbook.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  @GetMapping(value={"/","/join"})
  public String entry() {
    return "index";
  }
}
