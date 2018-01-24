package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.Doubling;
import com.greenfoxacademy.demo.models.Error;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {
  @GetMapping("/doubling")
  public Object doubleInput(@RequestParam(value = "input", required = false) Double number){
    if(number == null){
      return new Error("Please provide an input!");
    }
    return new Doubling(number);
  }
}
