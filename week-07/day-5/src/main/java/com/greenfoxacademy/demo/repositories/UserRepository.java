package com.greenfoxacademy.demo.repositories;

import com.greenfoxacademy.demo.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
  User findByName(String searchedName);
  //boolean findByNameExists(String searchedName);
}
