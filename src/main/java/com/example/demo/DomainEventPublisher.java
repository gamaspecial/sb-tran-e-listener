package com.example.demo;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import lombok.NonNull;

/**
 * ドメインイベントパブリッシャ
 */
@Component
public class DomainEventPublisher implements ApplicationEventPublisherAware {

  private static ApplicationEventPublisher publisher;

  @Override
  public void setApplicationEventPublisher(@NonNull ApplicationEventPublisher applicationEventPublisher) {
    DomainEventPublisher.publisher = applicationEventPublisher;
  }

  public static void publish(@NonNull DomainEventBase domainEvent) {
    System.out.println("DomainEventPublisher.publish!!");
    publisher.publishEvent(domainEvent);
  }
}
