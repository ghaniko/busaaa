package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.*;
import com.greenfoxacademy.demo.models.Error;
import com.greenfoxacademy.demo.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayHandlerController {

  @Autowired
  LogService logService;

  @PostMapping("/arrays")
  public Object arrays(@RequestBody(required = false) WhatAndList whatAndList) {
    Integer tempNumber = 0;
    Integer[] doubleNumbers = new Integer[4];
    if (whatAndList == null) {
      return new Error("Please provide a number!");
    } else if (whatAndList.getWhat().equals("sum")) {
      for (int i = 0; i < whatAndList.getNumbers().length; i++) {
        tempNumber += whatAndList.getNumbers()[i];
      }
      logService.createLog("sum", "numbers :" + whatAndList.getNumbers());
      return new Result(tempNumber);
    } else if (whatAndList.getWhat().equals("multiply")){
      tempNumber = 1;
      for (int i = 0; i < whatAndList.getNumbers().length; i++) {
        tempNumber = tempNumber * whatAndList.getNumbers()[i];
      }
      return new Result(tempNumber);
    } else {
      for (int i = 0; i < whatAndList.getNumbers().length; i++) {
        doubleNumbers[i] = 2 * whatAndList.getNumbers()[i];
      }
      return new WhatAndList(whatAndList.getWhat(), doubleNumbers);
    }
  }
}
