package de.bitgrip.mapstruct.example.mapper;

import de.bitgrip.mapstruct.example.mapper.config.AirplanerMapperConfig;
import de.bitgrip.mapstruct.example.model.source.Airplane;
import de.bitgrip.mapstruct.example.model.target.AirplaneDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@Mapper(config = AirplanerMapperConfig.class)
public abstract class AirplaneMapper {

  @InheritConfiguration(name = "mapFlyingVehicle")
  public abstract AirplaneDTO mapAirplane(Airplane airplane);
}
