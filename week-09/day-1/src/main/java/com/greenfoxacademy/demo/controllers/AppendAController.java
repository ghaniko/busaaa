package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.factories.LogFactory;
import com.greenfoxacademy.demo.models.AppendA;
import com.greenfoxacademy.demo.models.Error;
import com.greenfoxacademy.demo.models.WelcomeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {

  @Autowired
  LogFactory logFactory;

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable String appendable){
    if(appendable == null){
      return new Error("404");
    } else {
      logFactory.createLog("/appenda", appendable);
      return new AppendA(appendable);
    }
  }
}
