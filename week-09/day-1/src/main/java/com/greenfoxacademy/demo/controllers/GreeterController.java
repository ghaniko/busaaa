package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.Doubling;
import com.greenfoxacademy.demo.models.Error;
import com.greenfoxacademy.demo.models.WelcomeMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {
  @GetMapping("/greeter")
  public Object greetSomebody(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "title", required = false) String title){
    if(name == null){
      return new Error("Please provide a name!");
    } else if (title == null){
      return new Error("Please provide a title!");
    } else{
      return new WelcomeMessage(name, title);
    }
  }
}
