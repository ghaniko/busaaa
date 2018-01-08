package com.greenfoxacademy.demo.Controllers;

import com.greenfoxacademy.demo.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController

public class HelloRESTController {

  @RequestMapping(value = "/greeting", method = RequestMethod.GET)
  public Greeting greeting(@RequestParam(value = "barmimas", required = false) String name){
    if (name == null) {
      name = "world";
    }
     Greeting myGreeting = new Greeting(1, name);
    return myGreeting;
  }
}
