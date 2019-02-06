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
public class TrackVehicleDTO extends VehicleDTO {

  private String tracks;

  public TrackVehicleDTO() {
  }

  public TrackVehicleDTO(String id, List<String> transportationObjects, Integer weight, Length width, Length height, Length length, String breakPlate, String body, String tracks) {
    super(id, transportationObjects, weight, width, height, length, breakPlate, body);
    this.tracks = tracks;
  }

  public TrackVehicleDTO(String id, List<String> transportationObjects, Integer weight, Length width, Length height, Length length, String tracks) {
    super(id, transportationObjects, weight, width, height, length);
    this.tracks = tracks;
  }
}
