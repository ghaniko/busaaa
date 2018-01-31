package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.Car;
import com.greenfoxacademy.demo.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

  @Autowired
  CarRepository carRepository;

  @Override
  public List<Car> lookUpPlate(String plate) {
    return carRepository.findAllByPlateStartingWith(plate);
  }

  @Override
  public List<Car> lookUpBrand(String brand) {
    return carRepository.findAllByCarBrand(brand);
  }

  @Override
  public List<Car> findAll() {
    return (List<Car>)carRepository.findAll();
  }

  @Override
  public List<Car> findIfContains(String substring) {
    return carRepository.findAllByPlateContains(substring);
  }
}
