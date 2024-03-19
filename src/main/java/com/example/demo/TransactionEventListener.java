package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class TransactionEventListener {

  @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
  public void handleCustomEvent(Event event) {
    System.out.println(event.getMessage() + " TransactionEventListener!!");
  }
}
