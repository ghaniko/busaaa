package com.greenfoxacademy.demo.models;

import org.springframework.stereotype.Component;

@Component
public class What {
  private String what;

  public What() {
  }

  public What(String what) {
    this.what = what;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }
}
