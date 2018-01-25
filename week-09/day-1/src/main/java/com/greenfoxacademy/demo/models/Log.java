package com.greenfoxacademy.demo.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Component
public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  @CreationTimestamp
  @JsonIgnore
  Timestamp createdAt;
  String endpoint;
  String data;

  public Log() {
  }

  public Log(String endpoint, String data) {
    this.id = id;
    this.createdAt = createdAt;
    this.endpoint = endpoint;
    this.data = data;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
