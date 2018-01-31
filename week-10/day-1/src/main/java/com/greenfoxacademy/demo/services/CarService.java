package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {
  List<Car> lookUpPlate(String input);
  List<Car> lookUpBrand(String input);
  List<Car> findAll();
  List<Car> findIfContains(String substring);
}
