package com.greenfoxacademy.demo.repositories;

import com.greenfoxacademy.demo.models.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer>{
  List<Car> findAllByPlateStartingWith(String input);
  List<Car> findAllByCarBrand(String input);
  List<Car> findAllByPlateContains(String input);
}
