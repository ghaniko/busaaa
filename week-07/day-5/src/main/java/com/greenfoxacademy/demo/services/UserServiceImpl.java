package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.factories.UserFactory;
import com.greenfoxacademy.demo.models.User;
import com.greenfoxacademy.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

  @Autowired
  UserRepository userRepository;

  @Autowired
  UserFactory userFactory;

  @Override
  public List<User> getAllUser() {
    return (List<User>) userRepository.findAll();
  }

  @Override
  public User getUserById(int id) {
    return userRepository.findOne(id);
  }

  @Override
  public void modifyUser(User user) {
    userRepository.save(user);
  }

  @Override
  public void deleteUser(int id) {
    userRepository.delete(id);
  }

  @Override
  public void addUser(User user) {
    userRepository.save(user);
  }

  @Override
  public boolean contains(User user) {

    //return userRepository.findByNameExists(user.getName());

    if(userRepository.findByName(user.getName()) == null){
      return false;
    } else {
      return true;
    }
  }
}
