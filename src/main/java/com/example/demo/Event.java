package com.example.demo;

public class Event extends DomainEventBase {

  private String message;

  public Event(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}

