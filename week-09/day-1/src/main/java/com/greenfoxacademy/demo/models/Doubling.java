package com.greenfoxacademy.demo.models;

import org.springframework.stereotype.Component;

@Component
public class Doubling {

  private int received;
  private int result;

  public Doubling() {

  }

  public Doubling(int received) {
    this.received = received;
    this.result = 2 * received;
  }

  public Integer doubleInput(int received){
    return 2 * received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

}
