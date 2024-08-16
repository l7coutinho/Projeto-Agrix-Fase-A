package com.betrybe.agrix.entity;

import jakarta.persistence.*;

import java.util.List;

/**
 * Class type Farm.
 */
@Entity
public class Farm {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private Double size;

  @OneToMany(mappedBy = "farm")
  private List<Crop> crops;

  public Farm() {}

  /**
   * Constructor Farm.
   */
  public Farm(String name, Double size) {
    this.size = size;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSize() {
    return size;
  }

  public void setSize(double size) {
    this.size = size;
  }
}