package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.ListOfLogs;
import com.greenfoxacademy.demo.models.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogService {
  List<Log> getAllLogs();
  Log getLogById(int id);
  void modifyLog(Log log);
  void deleteLog(int id);
  void addLog(Log log);
  void createLog(String endpoint, String data);
  ListOfLogs getLogList();
}
