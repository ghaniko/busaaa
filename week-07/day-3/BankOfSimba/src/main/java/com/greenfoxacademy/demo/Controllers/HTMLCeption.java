package com.greenfoxacademy.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLCeption {
  @RequestMapping("/ception")
  public String show(Model model){
    model.addAttribute("mytext", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    model.addAttribute("mytext2", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "ception";
  }
}
