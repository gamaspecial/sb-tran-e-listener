package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
@AllArgsConstructor
public class EventService {

  @Autowired
  private ApplicationEventPublisher applicationEventPublisher;

  public void doSomething() {
    applicationEventPublisher.publishEvent(new Event(this, "Hello"));
    System.out.println("doSomething!!");
  }
}
