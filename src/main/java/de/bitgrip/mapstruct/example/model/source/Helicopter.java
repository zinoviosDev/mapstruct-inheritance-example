package de.bitgrip.mapstruct.example.model.source;

import lombok.Builder;
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
public class Helicopter extends FlyingVehicle {

  private String rotor;

  @Builder
  public Helicopter(String rotor, Length maxAltitude, Break mainBreak, String id, List<String> transportationObjects,
                    Integer weight, Length width,
                    Length height, Length length) {
    super(maxAltitude, mainBreak, id, transportationObjects, weight, width, height, length);
    this.rotor = rotor;
  }
}
