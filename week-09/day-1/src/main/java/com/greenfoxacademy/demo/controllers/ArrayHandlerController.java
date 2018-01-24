package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.*;
import com.greenfoxacademy.demo.models.Error;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayHandlerController {

  @PostMapping("/arrays")
  public Object arrays(@RequestBody(required = false) What what, @RequestBody(required = false) NumbersList numbers) {
    Integer tempNumber = 0;
    Integer[] doubleNumbers = new Integer[4];
    if (what == null) {
      return new Error("Please provide a number!");
    } else if (what.getWhat().equals("sum")) {
      for (int i = 0; i < numbers.getNumbers().length; i++) {
        tempNumber += numbers.getNumbers()[i];
      }
      return new Result(tempNumber);
    } else if (what.getWhat().equals("multiply")){
      tempNumber = 1;
      for (int i = 0; i < numbers.getNumbers().length; i++) {
        tempNumber = tempNumber * numbers.getNumbers()[i];
      }
      return new Result(tempNumber);
    } else {
      for (int i = 0; i < numbers.getNumbers().length; i++) {
        doubleNumbers[i] = 2 * numbers.getNumbers()[i];
      }
      return new NumbersList(doubleNumbers);
    }
  }
}
