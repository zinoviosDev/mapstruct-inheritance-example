package de.bitgrip.mapstruct.example.mapper;

import de.bitgrip.mapstruct.example.mapper.config.MotorbikeMapperConfig;
import de.bitgrip.mapstruct.example.model.source.Motorbike;
import de.bitgrip.mapstruct.example.model.target.MotorbikeDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@Mapper(config = MotorbikeMapperConfig.class)
public abstract class MotorbikeMapper {

  @InheritConfiguration(name = "mapVehicle")
  public abstract MotorbikeDTO map(Motorbike motorbike);
}
