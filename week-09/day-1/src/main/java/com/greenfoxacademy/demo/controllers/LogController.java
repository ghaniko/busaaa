package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
  @Autowired
  LogService logService;

  @GetMapping("/log")
  public Object listLogs(){

    return logService.getLogList();
  }
}
