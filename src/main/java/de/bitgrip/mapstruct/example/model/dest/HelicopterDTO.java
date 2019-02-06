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
public class HelicopterDTO extends FlyingVehicleDTO {

  private String rotor;

  public HelicopterDTO(String id, List<String> transportationObjects, Integer weight, Length width, Length height, Length length, String breakPlate, String body, String rotor) {
    super(id, transportationObjects, weight, width, height, length, breakPlate, body);
    this.rotor = rotor;
  }

  public HelicopterDTO(String id, List<String> transportationObjects, Integer weight, Length width, Length height, Length length, String rotor) {
    super(id, transportationObjects, weight, width, height, length);
    this.rotor = rotor;
  }

  public HelicopterDTO() {
  }
}
