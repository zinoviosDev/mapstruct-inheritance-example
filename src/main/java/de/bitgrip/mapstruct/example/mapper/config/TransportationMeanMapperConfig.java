package de.bitgrip.mapstruct.example.mapper.config;

import de.bitgrip.mapstruct.example.model.source.TransportationMean;
import de.bitgrip.mapstruct.example.model.target.TransportationMeanDTO;
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
public interface TransportationMeanMapperConfig {

  void mapTransportationMean(TransportationMean mean, @MappingTarget TransportationMeanDTO dto);
}
