package de.bitgrip.mapstruct.example.mapper.config;

import de.bitgrip.mapstruct.example.model.source.FlyingVehicle;
import de.bitgrip.mapstruct.example.model.target.FlyingVehicleDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingTarget;

/**
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@MapperConfig
public interface FlyingVehicleMapperConfig extends VehicleMapperConfig {

  @InheritConfiguration(name = "mapVehicle")
  void mapFlyingVehicle(FlyingVehicle flyingVehicle, @MappingTarget FlyingVehicleDTO flyingVehicleDTO);
}
