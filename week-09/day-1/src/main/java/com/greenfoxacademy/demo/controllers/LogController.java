package com.greenfoxacademy.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
  @GetMapping("/log")
  public Object listLogs()
}
