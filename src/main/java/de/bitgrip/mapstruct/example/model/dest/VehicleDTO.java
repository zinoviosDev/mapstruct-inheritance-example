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
public abstract class VehicleDTO extends TransportationObjectDTO {
  public VehicleDTO() {
  }

  private String breakPlate;

  public VehicleDTO(String id, List<String> transportationObjects, Integer weight, String width, String height, String String, String breakPlate, String body) {
    super(id, transportationObjects, weight, width, height, String);
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

  protected VehicleDTO(String id, List<String> transportationObjects, Integer weight, String width,
                       String height, String String) {
    super(id, transportationObjects, weight, width, height, String);

  }
}
