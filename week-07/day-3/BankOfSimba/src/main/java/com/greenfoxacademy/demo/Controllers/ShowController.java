package com.greenfoxacademy.demo.Controllers;

import com.greenfoxacademy.demo.Models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShowController {

  BankAccount simba = new BankAccount("Simba", 2000, "lion");

  @RequestMapping("/show")
  public String show(Model model){
    model.addAttribute("myName", simba.getName());
    model.addAttribute("myBalance", String.format("%.2f", simba.getBalance()));
    model.addAttribute("myAnimalType", simba.getAnimalType());
    return "show";
  }
}
