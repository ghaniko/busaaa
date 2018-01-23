package com.greenfoxacademy.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
  @JsonIgnore
  private String name;
  @JsonIgnore
  private String title;
  @JsonProperty("welcome_message")
  private String welcomeMessage;

  public WelcomeMessage() {
  }

  public WelcomeMessage(String name, String title) {
    this.name = name;
    this.title = title;
    this.welcomeMessage = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWelcomeMessage() {
    return welcomeMessage;
  }

  public void setWelcomeMessage(String welcomeMessage) {
    this.welcomeMessage = welcomeMessage;
  }
}
