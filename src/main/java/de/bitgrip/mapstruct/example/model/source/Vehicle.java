package de.bitgrip.mapstruct.example.model.source;

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
public abstract class Vehicle extends TransportationObject {

  private Break mainBreak;

  protected Vehicle(Break mainBreak, String id, List<String> transportationObjects, Integer weight, Length width,
                    Length height, Length length) {
    super(id, transportationObjects, weight, width, height, length);
    this.mainBreak = mainBreak;
  }
}
