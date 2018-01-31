package com.greenfoxacademy.demo.collections;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClothItem {
  private List<String> clothItem;


  public ClothItem() {
    this.clothItem = Arrays.asList("Green Fox Jumper",
            "Half-Ip Ribbed Mock-Turtleneck Sweater",
            "Green Fox Short-Sleeved Mesh Polo Shirt",
            "Wool/Alpaca Shawl Collar Cardigan",
            "Two-Tone Sleeveless Sheath Dress",
            "Strecth Steamed Pencil Skirt"
            );
  }

  public List<String> getClothItem() {
    return clothItem;
  }

  public void setClothItem(List<String> clothItem) {
    this.clothItem = clothItem;
  }

}
