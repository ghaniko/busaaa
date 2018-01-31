package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.Clothes;
import com.greenfoxacademy.demo.services.ClothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClothRestController {
  @Autowired
  ClothService clothService;

  @GetMapping("/warehouse/query")
  public Object listClothes(@RequestParam Float price,
                            @RequestParam String type){
    Clothes clothes = new Clothes();
    if(price == null || type == null){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } else {
      if (type.equals("equal")) {
        clothes.setClothes(clothService.findAllByUnitPriceEquals(price));
        if (clothes.getClothes() == null) {
          clothes.setResult("not ok");
        } else {
          clothes.setResult("ok");
        }
      } else if (type.equals("higher")) {
        clothes.setClothes(clothService.findAllByUnitPriceGreaterThan(price));
        if (clothes.getClothes() == null) {
          clothes.setResult("not ok");
        } else {
          clothes.setResult("ok");
        }
      } else if (type.equals("lower")) {
        clothes.setClothes(clothService.findAllByUnitPriceLessThan(price));
        if (clothes.getClothes() == null) {
          clothes.setResult("not ok");
        } else {
          clothes.setResult("ok");
        }
      }
    } return clothes;
  }
}
