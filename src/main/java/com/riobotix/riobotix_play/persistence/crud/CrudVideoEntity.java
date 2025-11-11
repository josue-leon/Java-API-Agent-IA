package com.riobotix.riobotix_play.persistence.crud;

import com.riobotix.riobotix_play.persistence.entity.VideoEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudVideoEntity extends CrudRepository<VideoEntity, Long> {

}
