package de.bitgrip.mapstruct.example.mapper;

import de.bitgrip.mapstruct.example.model.source.Length;
import org.mapstruct.Mapper;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@Mapper
public abstract class LengthMapper {

  public String mapLength(Length length) {
    return length.toString();
  }
}
