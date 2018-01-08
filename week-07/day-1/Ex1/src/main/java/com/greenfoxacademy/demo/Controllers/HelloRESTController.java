package com.greenfoxacademy.demo.Controllers;

import com.greenfoxacademy.demo.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;


@RestController


public class HelloRESTController {
  AtomicLong myAtomic = new AtomicLong();
  @RequestMapping(value = "/greeting", method = RequestMethod.GET)
  public Greeting greeting(@RequestParam(value = "name", required = false) String name){
    if (name == null) {
      name = "world";
    }
    Greeting myGreeting = new Greeting(myAtomic.incrementAndGet(), name);
    return myGreeting;
  }
}
