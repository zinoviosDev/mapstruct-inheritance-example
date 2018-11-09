package de.bitgrip.mapstruct.example.mapper;

import de.bitgrip.mapstruct.example.mapper.config.CarMapperConfig;
import de.bitgrip.mapstruct.example.model.source.Car;
import de.bitgrip.mapstruct.example.model.target.CarDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@Mapper(config = CarMapperConfig.class)
public abstract class CarMapper {

  @InheritConfiguration(name = "mapVehicle")
  public abstract CarDTO mapCar(Car car);
}
