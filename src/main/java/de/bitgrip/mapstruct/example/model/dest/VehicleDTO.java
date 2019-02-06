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
public abstract class VehicleDTO extends TransportationObjectDTO {
  public VehicleDTO() {
  }

  private String breakPlate;

  public VehicleDTO(String id, List<String> transportationObjects, Integer weight, Length width, Length height, Length length, String breakPlate, String body) {
    super(id, transportationObjects, weight, width, height, length);
    this.breakPlate = breakPlate;
    this.breakBody = body;
  }

  public String getBreakPlate() {
    return breakPlate;
  }

  public void setBreakPlate(String breakPlate) {
    this.breakPlate = breakPlate;
  }

  public String getBreakBody() {
    return breakBody;
  }

  public void setBreakBody(String breakBody) {
    this.breakBody = breakBody;
  }

  private String breakBody;

  protected VehicleDTO(String id, List<String> transportationObjects, Integer weight, Length width,
                       Length height, Length length) {
    super(id, transportationObjects, weight, width, height, length);

  }
}
