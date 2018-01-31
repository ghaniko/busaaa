package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.Cloth;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClothService {
  List<Cloth> findAllClothes();
  List<Cloth> findClothWithItemNameAndSize(String itemName, String size);
  List<Cloth> findAllByUnitPriceEquals(float price);
  List<Cloth> findAllByUnitPriceLessThan(float price);
  List<Cloth> findAllByUnitPriceGreaterThan(float price);
}
