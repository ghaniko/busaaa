package com.greenfoxacademy.demo.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  @CreationTimestamp
  @JsonIgnore
  Timestamp createdAt;
  String endpoint;
  String data; 
}
