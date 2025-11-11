package com.riobotix.riobotix_play.persistence.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "riobotix_play_videos")
public class VideoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, length = 150, unique = true)
  private String titulo;

  @Column(nullable = false, precision = 3)
  private Integer duracion;

  @Column(nullable = false, length = 40)
  private String categoria;

  @Column(name = "fecha_estreno")
  private LocalDate fechaCreacion;

  @Column(precision = 3, scale = 2)
  private BigDecimal rating;

  @Column(nullable = false, length = 1)
  private String estado;

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setDuracion(Integer duracion) {
    this.duracion = duracion;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public void setFechaCreacion(LocalDate fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  public void setRating(BigDecimal rating) {
    this.rating = rating;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getTitulo() {
    return titulo;
  }

  public Integer getDuracion() {
    return duracion;
  }

  public String getCategoria() {
    return categoria;
  }

  public LocalDate getFechaCreacion() {
    return fechaCreacion;
  }

  public BigDecimal getRating() {
    return rating;
  }

  public String getEstado() {
    return estado;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
