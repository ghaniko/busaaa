package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.Doubling;
import com.greenfoxacademy.demo.models.Error;
import com.greenfoxacademy.demo.models.Log;
import com.greenfoxacademy.demo.models.WelcomeMessage;
import com.greenfoxacademy.demo.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {
  @Autowired
  LogService logService;

  @GetMapping("/greeter")
  public Object greetSomebody(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "title", required = false) String title){
    if(name == null){
      return new Error("Please provide a name!");
    } else if (title == null){
      return new Error("Please provide a title!");
    } else{
      Log greeterLog = new Log("/greeter", "name = " + name + "title = " + title);
      logService.addLog(greeterLog);
      return new WelcomeMessage(name, title);
    }
  }
}
