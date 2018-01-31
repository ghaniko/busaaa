package com.greenfoxacademy.demo.collections;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClothSize {
  private List<String> clothSize;

  public ClothSize() {
    this.clothSize = Arrays.asList( "m", "l", "xxl", "s", "xl");
  }

  public List<String> getClothSize() {
    return clothSize;
  }

  public void setClothSize(List<String> clothSize) {
    this.clothSize = clothSize;
  }
}
