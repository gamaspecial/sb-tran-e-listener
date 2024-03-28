package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
@AllArgsConstructor
public class EventService {

  public void doSomething() {
    DomainEventPublisher.publish(new Event("Hello"));
    System.out.println("doSomething!!");
  }
}
