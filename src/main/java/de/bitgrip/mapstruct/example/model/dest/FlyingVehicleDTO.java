package de.bitgrip.mapstruct.example.model.dest;

import de.bitgrip.mapstruct.example.model.source.Length;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@Data
@ToString(callSuper = true)
public abstract class FlyingVehicleDTO extends VehicleDTO {
  public FlyingVehicleDTO() {
  }

  private Length maxAltitude;


  public FlyingVehicleDTO(String id, List<String> transportationObjects, Integer weight, Length width, Length height, Length length, String breakPlate, String body) {
    super(id, transportationObjects, weight, width, height, length, breakPlate, body);
  }

  protected FlyingVehicleDTO(String id, List<String> transportationObjects, Integer weight, Length width, Length height, Length length) {
    super(id, transportationObjects, weight, width, height, length);
  }
}
