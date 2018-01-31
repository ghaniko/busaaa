package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
  List<User> getAllUser();
  User getUserById(int id);
  void modifyUser(User user);
  void deleteUser(int id);
  void addUser(User user);
  boolean contains(User user);
}
