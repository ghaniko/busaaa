package com.greenfoxacademy.demo.Models;

public class BankAccount {
  private String name;
  private float balance;
  private String animalType;
  private boolean isKing;



  private String isGood;

  public BankAccount(String name, float balance, String animalType, boolean isKing, String isGood) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGood = isGood;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getBalance() {
    return balance;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public String getIsGood() {
    return isGood;
  }

  public void setIsGood(String isGood) {
    this.isGood = isGood;
  }
}

