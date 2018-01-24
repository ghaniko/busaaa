package com.greenfoxacademy.demo.models;

import org.springframework.stereotype.Component;

@Component
public class Doubling {

  private Double received;
  private Double result;

  public Doubling() {

  }

  public Doubling(double received) {
    this.received = received;
    this.result = 2 * received;
  }

  public Double doubleInput(double received){
    return 2 * received;
  }

  public Double getResult() {
    return result;
  }

  public void setResult(double result) {
    this.result = result;
  }

  public Double getReceived() {
    return received;
  }

  public void setReceived(double received) {
    this.received = received;
  }

}
