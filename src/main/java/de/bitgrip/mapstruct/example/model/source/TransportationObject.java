package de.bitgrip.mapstruct.example.model.source;

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
public abstract class TransportationObject {

  private String id;

  private List<String> transportationObjects;

  private Integer weight;

  private Length width;

  private Length height;

  private Length length;

  protected TransportationObject(String id, List<String> transportationObjects, Integer weight, Length width,
                                 Length height, Length length) {
    this.id = id;
    this.transportationObjects = transportationObjects;
    this.weight = weight;
    this.width = width;
    this.height = height;
    this.length = length;
  }

}
