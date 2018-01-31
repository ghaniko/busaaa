package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.factories.LogFactory;
import com.greenfoxacademy.demo.models.ListOfLogs;
import com.greenfoxacademy.demo.models.Log;
import com.greenfoxacademy.demo.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LogServiceImpl implements LogService {

  @Autowired
  LogRepository logRepository;

  @Autowired
  LogFactory logFactory;

  @Autowired
  ListOfLogs listOfLogs;

  @Override
  public ListOfLogs getLogList(){
    listOfLogs.setEntries(getAllLogs());
    listOfLogs.setEntryCount(getAllLogs().size());
    return listOfLogs;
  }

  @Override
  public List<Log> getAllLogs() {
    return (List<Log>) logRepository.findAll() ;
  }

  @Override
  public Log getLogById(int id) {
    return logRepository.findOne(id);
  }

  @Override
  public void modifyLog(Log log) {
    logRepository.save(log);
  }

  @Override
  public void deleteLog(int id) {
    logRepository.delete(id);
  }

  @Override
  public void addLog(Log log) {
    logRepository.save(log);
  }

  @Override
  public void createLog(String endpoint, String data){
    addLog(logFactory.createLog(endpoint, data));
  }


}
