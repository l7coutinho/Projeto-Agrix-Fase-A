package com.betrybe.agrix.dto;

import com.betrybe.agrix.entity.Crop;

/**
 * Class Type CropCreationDto.
 */
public record CropCreationDto(String name, Double plantedArea) {
  /**
   * Constructor CropCreationDto.
   */
  public Crop toEntity() {
    return new Crop(name, plantedArea);
  }
}
