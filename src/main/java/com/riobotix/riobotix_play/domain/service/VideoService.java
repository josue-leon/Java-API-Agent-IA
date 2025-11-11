package com.riobotix.riobotix_play.domain.service;

import com.riobotix.riobotix_play.domain.dto.VideoDto;
import com.riobotix.riobotix_play.domain.repository.VideoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
  private final VideoRepository videoRepository;

  public VideoService(VideoRepository videoRepository) {
    this.videoRepository = videoRepository;
  }

  public List<VideoDto> getAll(){
    return this.videoRepository.getAll();
  }
}
