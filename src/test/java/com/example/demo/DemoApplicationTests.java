package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@ActiveProfiles("test")
@SpringBootTest
class EventServiceTests {

  @Autowired
  private EventService eventService;


  @Test
  @Transactional
  void イベントの遅延発火てすとだよ() {
    eventService.doSomething();
  }
}
