package de.bitgrip.mapstruct.example.mapper.config;

import de.bitgrip.mapstruct.example.mapper.LengthMapper;
import org.mapstruct.MapperConfig;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@MapperConfig(uses = LengthMapper.class)
public interface TrackVehicleMapperConfig extends VehicleMapperConfig {

}
