package com.greenfoxacademy.demo.models;

import org.springframework.stereotype.Component;

@Component
public class Error {
  String error;

  public Error() {
  }

  public Error(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
