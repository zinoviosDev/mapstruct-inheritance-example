package de.bitgrip.mapstruct.example.model.dest;

import de.bitgrip.mapstruct.example.model.source.Length;
import lombok.Data;

import java.util.List;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@Data
public abstract class TransportationObjectDTO {
  public TransportationObjectDTO() {
  }

  private String id;

  private List<String> transportationObjects;

  private Integer weight;

  private String width;

  private String height;

  private String length;

  protected TransportationObjectDTO(String id, List<String> transportationObjects, Integer weight, String width,
                                    String height, String length) {
    this.id = id;
    this.transportationObjects = transportationObjects;
    this.weight = weight;
    this.width = width;
    this.height = height;
    this.length = length;
  }

}
