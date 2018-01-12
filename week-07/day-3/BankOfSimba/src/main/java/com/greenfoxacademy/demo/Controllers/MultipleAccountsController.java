package com.greenfoxacademy.demo.Controllers;

import com.greenfoxacademy.demo.Models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MultipleAccountsController {

  List<BankAccount> animals = new ArrayList<>(Arrays.asList(
          new BankAccount("Simba", 2000, "lion", true, "Good"),
          new BankAccount("Pumba", 1000, "warhog", false, "Good"),
          new BankAccount("Lovacska", 500, "horse", false, "Bad"),
          new BankAccount("Elafani", 300, "elephant", false, "Bad")));

  @RequestMapping(value = "/list", method = RequestMethod.GET)
  public String show(Model model){

    model.addAttribute("myAnimals", animals);
    return "list";
  }

  @RequestMapping(value = "/list/{accountIndex}", method = RequestMethod.POST)
  public String raise(@PathVariable int accountIndex){
    if(animals.get(accountIndex).isKing()){
      animals.get(accountIndex).setBalance(animals.get(accountIndex).getBalance() + 100);
    } else {
      animals.get(accountIndex).setBalance(animals.get(accountIndex).getBalance() + 10);
    }
    return new String("redirect:/list");
  }
}

