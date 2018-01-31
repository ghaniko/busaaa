package com.greenfoxacademy.demo.factories;

import com.greenfoxacademy.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {
  public User createUser(){
    User user = new User();
    return user;
  }

}
