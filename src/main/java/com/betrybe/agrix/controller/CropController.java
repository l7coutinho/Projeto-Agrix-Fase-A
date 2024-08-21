package com.betrybe.agrix.controller;

import com.betrybe.agrix.dto.CropDto;
import com.betrybe.agrix.entity.Crop;
import com.betrybe.agrix.service.CropService;
import com.betrybe.agrix.exception.CropNotFoundException;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Class: Crop Controller.
 */
@RestController
@RequestMapping("/crops")
public class CropController {
  private final CropService cropService;

  public CropController(CropService cropService) {
    this.cropService = cropService;
  }

  /**
   * Method getAllCrops.
   */
  @GetMapping
  public List<CropDto> getAllCrops() throws CropNotFoundException {
    List<Crop> allCrops = cropService.getAllCrops();
    return allCrops.stream()
            .map(CropDto::fromEntity)
            .toList();
  }

  /**
    Method findCropById.
   */
  @GetMapping("/{id}")
  public CropDto findCropById(@PathVariable Long id) throws CropNotFoundException {
    return CropDto.fromEntity(
            cropService.findCropById(id)
    );
  }
}