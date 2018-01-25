package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.Doubling;
import com.greenfoxacademy.demo.models.Error;
import com.greenfoxacademy.demo.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

  @Autowired
  Doubling doubling;

  @Autowired
  Error error;

  @Autowired
  LogService logService;

  @GetMapping("/doubling")
  public Object doubleInput(@RequestParam(value = "input", required = false) Double number){
    if(number == null){
      error.setError("Please provide an input!");
      return error;
    }
    logService.createLog("/doubling", "input " + number);
    return new Doubling(number);
  }
}
