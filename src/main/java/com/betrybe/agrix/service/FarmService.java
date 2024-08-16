package com.betrybe.agrix.service;

import com.betrybe.agrix.dto.FarmDto;
import com.betrybe.agrix.entity.Farm;
import com.betrybe.agrix.repository.FarmRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class: Farm Service.
 */
@Service
public class FarmService {
  private final FarmRepository farmRepository;

  @Autowired
  public FarmService(FarmRepository farmRepository) {
    this.farmRepository = farmRepository;
  }

  /**
   * Method CreateFarm.
   */

  public Farm create(Farm farm) {
    return farmRepository.save(farm);
  }

  /**
   * Get all farms list.
   */
  public List<Farm> findAll() {
    return farmRepository.findAll();
  }

  /**
   * Method findById.
   */
  public Optional<FarmDto> findById(Long id) {
    return farmRepository.findById(id)
            .map(farm -> new FarmDto(farm.getId(), farm.getName(), farm.getSize()));
  }
}