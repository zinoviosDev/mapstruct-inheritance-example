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
public class AirplaneDTO extends FlyingVehicleDTO {

  private String wings;

  public AirplaneDTO() {
  }

  public AirplaneDTO(String id, List<String> transportationObjects, Integer weight, Length width, Length height, Length length, String breakPlate, String body, String wings) {
    super(id, transportationObjects, weight, width, height, length, breakPlate, body);
    this.wings = wings;
  }

  public AirplaneDTO(String id, List<String> transportationObjects, Integer weight, Length width, Length height, Length length, String wings) {
    super(id, transportationObjects, weight, width, height, length);
    this.wings = wings;
  }
}
