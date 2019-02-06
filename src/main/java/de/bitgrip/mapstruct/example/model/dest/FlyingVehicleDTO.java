package de.bitgrip.mapstruct.example.model.dest;

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

  private String maxAltitude;


  public FlyingVehicleDTO(String id, List<String> transportationObjects, Integer weight, String width, String height, String length, String breakPlate, String body) {
    super(id, transportationObjects, weight, width, height, length, breakPlate, body);
  }

  protected FlyingVehicleDTO(String id, List<String> transportationObjects, Integer weight, String width, String height, String length) {
    super(id, transportationObjects, weight, width, height, length);
  }
}
