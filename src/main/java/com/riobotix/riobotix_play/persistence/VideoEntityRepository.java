package com.riobotix.riobotix_play.persistence;

import com.riobotix.riobotix_play.domain.dto.VideoDto;
import com.riobotix.riobotix_play.domain.repository.VideoRepository;
import com.riobotix.riobotix_play.persistence.crud.CrudVideoEntity;
import com.riobotix.riobotix_play.persistence.mapper.VideoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VideoEntityRepository implements VideoRepository {

  private final CrudVideoEntity crudVideoEntity;
  private final VideoMapper videoMapper;

  public VideoEntityRepository(CrudVideoEntity crudVideoEntity, VideoMapper videoMapper) {
    this.crudVideoEntity = crudVideoEntity;
    this.videoMapper = videoMapper;
  }

  @Override
  public List<VideoDto> getAll(){
   return this.videoMapper.toDto(this.crudVideoEntity.findAll());
  }
}
