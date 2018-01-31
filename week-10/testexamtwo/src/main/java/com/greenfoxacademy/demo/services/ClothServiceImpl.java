package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.Cloth;
import com.greenfoxacademy.demo.repositories.ClothRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothServiceImpl implements ClothService{

  @Autowired
  ClothRepository clothRepository;

  @Override
  public List<Cloth> findAllClothes() {
    return (List<Cloth>) clothRepository.findAll();
  }

  @Override
  public List<Cloth> findClothWithItemNameAndSize(String itemName, String size) {
    return clothRepository.findClothByItemNameAndSize(itemName, size);
  }

  @Override
  public List<Cloth> findAllByUnitPriceEquals(float price) {
    return clothRepository.findAllByUnitPriceEquals(price);
  }

  @Override
  public List<Cloth> findAllByUnitPriceLessThan(float price) {
    return clothRepository.findAllByUnitPriceLessThan(price);
  }

  @Override
  public List<Cloth> findAllByUnitPriceGreaterThan(float price) {
    return clothRepository.findAllByUnitPriceGreaterThan(price);
  }
}
