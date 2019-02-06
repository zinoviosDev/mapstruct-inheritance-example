package de.bitgrip.mapstruct.example.mapper.config;

import de.bitgrip.mapstruct.example.mapper.LengthMapper;
import de.bitgrip.mapstruct.example.model.source.Car;
import de.bitgrip.mapstruct.example.model.dest.CarDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingTarget;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@MapperConfig(uses = LengthMapper.class)
public interface CarMapperConfig extends VehicleMapperConfig {

  @InheritConfiguration(name = "mapVehicle")
  void mapCar(Car car, @MappingTarget  CarDTO carDTO);
}
