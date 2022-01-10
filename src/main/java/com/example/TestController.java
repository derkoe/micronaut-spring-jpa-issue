package com.example;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private final TestEntityRepository entityRepository;
  
  public TestController(TestEntityRepository entityRepository) {
    this.entityRepository = entityRepository;
  }

  @GetMapping
  public List<TestEntity> wow() {
    return entityRepository.findAll();
  }
}
