package de.bitgrip.mapstruct.example.mapper;

import de.bitgrip.mapstruct.example.mapper.config.HelicopterMapperConfig;
import de.bitgrip.mapstruct.example.model.source.Helicopter;
import de.bitgrip.mapstruct.example.model.target.HelicopterDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@Mapper(config = HelicopterMapperConfig.class)
public abstract class HelicopterMapper {

  @InheritConfiguration(name = "mapFlyingVehicle")
  public abstract HelicopterDTO map(Helicopter helicopter);
}
