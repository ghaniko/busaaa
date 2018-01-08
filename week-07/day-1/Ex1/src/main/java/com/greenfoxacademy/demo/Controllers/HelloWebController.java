package com.greenfoxacademy.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller

public class HelloWebController {
  AtomicLong myLong = new AtomicLong();
  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name", required = false) String urlName) {

    model.addAttribute("name", urlName);
    model.addAttribute("count", myLong.incrementAndGet());
    return "greeting";
  }
}
