package de.bitgrip.mapstruct.example.model.source;

import lombok.Builder;
import lombok.Data;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@Data
@Builder
public class Break {

  private String plate;

  private String body;
}
