package de.bitgrip.mapstruct.example.mapper.config;

import de.bitgrip.mapstruct.example.model.source.TransportationObject;
import de.bitgrip.mapstruct.example.model.dest.TransportationObjectDTO;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingTarget;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@MapperConfig
public interface TransportationObjectMapperConfig {

  void mapTransportationObject(TransportationObject mean, @MappingTarget TransportationObjectDTO dto);
}
