package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.Error;
import com.greenfoxacademy.demo.models.Log;
import com.greenfoxacademy.demo.models.Result;
import com.greenfoxacademy.demo.models.Until;
import com.greenfoxacademy.demo.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

  @Autowired
  LogService logService;

  @PostMapping("/dountil/{what}")
  public Object doUntil(@PathVariable(value = "what") String what, @RequestBody(required = false) Until until) {
    int number1 = 0;
    if (until == null) {
      return new Error("Please provide a number!");
    } else if (what.equals("sum")) {
      for (int i = 1; i <= until.getUntil(); i++) {
        number1 += i;
      }
      logService.createLog("sum", "until: " + until.getUntil());
      return new Result(number1);
    } else {
      number1 = 1;
      for (int i = 1; i <= until.getUntil(); i++) {
        number1 = number1 * i;
      }
      logService.createLog("factor", "until: " + until.getUntil());
      return new Result(number1);
    }
  }
}
