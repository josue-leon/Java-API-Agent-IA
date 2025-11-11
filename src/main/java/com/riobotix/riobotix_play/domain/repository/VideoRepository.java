package com.riobotix.riobotix_play.domain.repository;

import com.riobotix.riobotix_play.domain.dto.VideoDto;

import java.util.List;

public interface VideoRepository {
  List<VideoDto> getAll();
}
