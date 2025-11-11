package com.riobotix.riobotix_play.domain.dto;

import java.time.LocalDate;

public record VideoDto(
    String titulo,
    Integer duracion,
    String categoria,
    LocalDate fechaCreacion,
    Double rating
) {
}
