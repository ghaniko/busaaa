package com.greenfoxacademy.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloWebController {
  @RequestMapping("/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("name", " World! (It is a web page.)");
    return "greeting";
  }
}
