package com.greenfoxacademy.demo.models;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NumbersList {
  Integer[] numbers;

  public NumbersList() {
  }

  public NumbersList(Integer[] numbers) {
    this.numbers = numbers;
  }

  public Integer[] getNumbers() {
    return numbers;
  }

  public void setNumbers(Integer[] numbers) {
    this.numbers = numbers;
  }
}
