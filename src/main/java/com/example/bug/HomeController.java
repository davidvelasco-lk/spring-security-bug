package com.example.bug;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping(path = "/greet")
  public String greet() {
    return "Hello World";
  }
}
