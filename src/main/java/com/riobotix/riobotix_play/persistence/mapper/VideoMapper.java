package com.riobotix.riobotix_play.persistence.mapper;

import com.riobotix.riobotix_play.domain.dto.VideoDto;
import com.riobotix.riobotix_play.persistence.entity.VideoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VideoMapper {
  @Mapping(source = "titulo", target = "titulo")
  @Mapping(source = "duracion", target = "duracion")
  @Mapping(source = "categoria", target = "categoria")
  @Mapping(source = "fechaCreacion", target = "fechaCreacion")
  @Mapping(source = "rating", target = "rating")

  VideoDto toDto(VideoEntity entity);
  List<VideoDto> toDto(Iterable<VideoEntity> entities);
}
