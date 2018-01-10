package com.greenfoxacademy.demo.Controllers;

import com.greenfoxacademy.demo.Models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MultipleAccountsController {

  List<BankAccount> animals = new ArrayList<>(Arrays.asList(
          new BankAccount("Simba", 2000, "lion"),
          new BankAccount("Pumba", 1000, "warhog"),
          new BankAccount("Lovacska", 500, "horse"),
          new BankAccount("Elafani", 300, "elephant")));

  @RequestMapping("/list")
  public String show(Model model){

    model.addAttribute("myAnimals", animals);
    return "list";
  }
}

