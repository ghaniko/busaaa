package com.greenfoxacademy.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AppendA {
  @JsonIgnore
  private String word;
  @JsonProperty("appended")
  private String wordWithA;

  public AppendA() {
  }

  public AppendA(String word) {
    this.word = word;
    this.wordWithA = word + "a";
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public String getWordWithA() {
    return wordWithA;
  }

  public void setWordWithA(String wordWithA) {
    this.wordWithA = wordWithA;
  }
}
