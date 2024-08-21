package com.betrybe.agrix.service;

import com.betrybe.agrix.entity.Crop;
import com.betrybe.agrix.exception.CropNotFoundException;
import com.betrybe.agrix.repository.CropRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class: Crop Service.
 */
@Service
public class CropService {

  private final CropRepository cropRepository;

  @Autowired
  public CropService(CropRepository cropRepository) {
    this.cropRepository = cropRepository;
  }

  /**
   * Method listAllCrops.
   */
  public List<Crop> getAllCrops() throws CropNotFoundException {
    return cropRepository.findAll();
  }

  /**
   * Method findCropById.
   */
  public Crop findCropById(Long id) throws CropNotFoundException {
    return cropRepository.findById(id)
            .orElseThrow(CropNotFoundException::new);
  }

}