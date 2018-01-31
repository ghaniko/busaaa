package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.factories.UserFactory;
import com.greenfoxacademy.demo.models.User;
import com.greenfoxacademy.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

  @Autowired
  UserService userService;

  @Autowired
  UserFactory userFactory;

  @GetMapping("/")
  public String showLoginPage() {
    return "login";
  }

  @GetMapping("/create")
  public String showCreateAccountPage(Model model){
    model.addAttribute("user", userFactory.createUser());
    return "create";
  }

  @PostMapping("/create")
  public String addAccount(@ModelAttribute User user){
    user.setIsExist(userService.contains(user));
    if(userService.contains(user)){
      return "redirect:/create";
    } else {
      userService.addUser(user);
      return "redirect:/";
    }
  }
}
