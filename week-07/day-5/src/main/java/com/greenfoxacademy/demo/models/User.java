package com.greenfoxacademy.demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private String password;
  private boolean isExist;
  @OneToMany
  private List<Fox> ownedFoxes;

  public User() {
  }

  public User(String name) {

    this.name = name;

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Fox> getOwnedFoxes() {
    return ownedFoxes;
  }

  public void setOwnedFoxes(List<Fox> ownedFoxes) {
    this.ownedFoxes = ownedFoxes;
  }

  public boolean getIsExist() {
    return isExist;
  }

  public void setIsExist(boolean exist) {
    isExist = exist;
  }
}
