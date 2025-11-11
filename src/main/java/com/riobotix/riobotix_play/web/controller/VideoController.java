package com.riobotix.riobotix_play.web.controller;

import com.riobotix.riobotix_play.domain.dto.VideoDto;
import com.riobotix.riobotix_play.domain.service.VideoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoController {

  private final VideoService videoService;

  public VideoController(VideoService videoService) {
    this.videoService = videoService;
  }

  @GetMapping("/videos")
  public List<VideoDto> getAll(){
    return this.videoService.getAll();
  }
}
