package com.greenfoxacademy.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListOfLogs {
  List<Log> entries;
  @JsonProperty("entry_count")
  int  entryCount;

  public ListOfLogs() {
  }

  public ListOfLogs(List<Log> entries, int entryCount) {
    this.entries = entries;
    this.entryCount = entryCount;
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public int getEntryCount() {
    return entryCount;
  }

  public void setEntryCount(int entryCount) {
    this.entryCount = entryCount;
  }
}
