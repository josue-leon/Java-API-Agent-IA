package com.riobotix.riobotix_play.web.controller;

import com.riobotix.riobotix_play.domain.service.RiobotixPlayAiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RiobotixController {

  private final RiobotixPlayAiService aiService;

  public RiobotixController(RiobotixPlayAiService aiService) {
    this.aiService = aiService;
  }

  @GetMapping("/saludo")
  public String  hello(){
    return this.aiService.generateGreeting();
  }
}
