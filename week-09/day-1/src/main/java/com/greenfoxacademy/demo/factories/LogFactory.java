package com.greenfoxacademy.demo.factories;

import com.greenfoxacademy.demo.models.Log;
import org.springframework.stereotype.Component;

@Component
public class LogFactory {
  public Log createLog(String endpoint, String data){
    Log log = new Log(endpoint, data);
    return log;
  }
}
