package de.bitgrip.mapstruct.example.mapper.config;

import de.bitgrip.mapstruct.example.model.source.Vehicle;
import de.bitgrip.mapstruct.example.model.target.VehicleDTO;
import org.mapstruct.*;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@MapperConfig
public interface VehicleMapperConfig extends TransportationObjectMapperConfig {

  @InheritConfiguration(name = "mapTransportationObject")
  @Mappings({
          @Mapping(source = "mainBreak.plate", target= "breakPlate"),
          @Mapping(source = "mainBreak.body", target= "breakBody")
  })
  void mapVehicle(Vehicle vehicle, @MappingTarget VehicleDTO dto);
}
