package com.betrybe.agrix.dto;

import com.betrybe.agrix.entity.Crop;

/**
 * Class Type CropDto.
 */
public record CropDto(Long id, Long farmId,String name, Double plantedArea) {
  /**
   * Constructor FarmDto.
   */
  public static CropDto fromEntity(Crop crop) {
    return new CropDto(
            crop.getId(),
            crop.getFarm().getId(),
            crop.getName(),
            crop.getPlantedArea()
    );
  }
}
