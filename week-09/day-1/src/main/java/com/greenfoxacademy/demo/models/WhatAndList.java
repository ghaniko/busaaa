package com.greenfoxacademy.demo.models;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WhatAndList {
  String what;
  Integer[] numbers;

  public WhatAndList() {
  }

  public WhatAndList(String what, Integer[] numbers) {
    this.numbers = numbers;
  }

  public Integer[] getNumbers() {
    return numbers;
  }

  public void setNumbers(Integer[] numbers) {
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }
}
