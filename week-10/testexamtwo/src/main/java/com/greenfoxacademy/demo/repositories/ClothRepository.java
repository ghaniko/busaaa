package com.greenfoxacademy.demo.repositories;

import com.greenfoxacademy.demo.models.Cloth;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClothRepository extends CrudRepository<Cloth, Integer>{
  List<Cloth> findClothByItemNameAndSize(String itemName, String itemSize);
  List<Cloth> findAllByUnitPriceEquals(float price);
  List<Cloth> findAllByUnitPriceLessThan(float price);
  List<Cloth> findAllByUnitPriceGreaterThan(float price);
}
