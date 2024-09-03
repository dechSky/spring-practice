package com.practice.spring_web.restcontroller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DisplayRestController {

  @GetMapping("/display")
  public String display() {
    return new String();
  }
}
