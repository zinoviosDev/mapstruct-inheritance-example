package de.bitgrip.mapstruct.example.mapper;

import de.bitgrip.mapstruct.example.mapper.config.TrackVehicleMapperConfig;
import de.bitgrip.mapstruct.example.model.source.TrackVehicle;
import de.bitgrip.mapstruct.example.model.target.TrackVehicleDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@Mapper(config = TrackVehicleMapperConfig.class)
public abstract class TrackVehicleMapper {

  @InheritConfiguration(name = "mapVehicle")
  public abstract TrackVehicleDTO mapTrackVehicle(TrackVehicle trackVehicle);
}
