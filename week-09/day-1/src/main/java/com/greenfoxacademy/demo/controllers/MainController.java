package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.Doubling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
    public String showIndexPage(){
    return "index";
  }
}
