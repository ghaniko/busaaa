package com.greenfoxacademy.demo.models;

import java.util.List;

public class Clothes {
  private String result;
  private List<Cloth> clothes;

  public Clothes() {
  }

  public Clothes(String result, List<Cloth> clothes) {
    this.result = result;
    this.clothes = clothes;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Cloth> getClothes() {
    return clothes;
  }

  public void setClothes(List<Cloth> clothes) {
    this.clothes = clothes;
  }
}
