package de.bitgrip.mapstruct.example.model.source;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
public class Length {

  private Integer length;

  private Units unit;

  public Length(Integer length, Units unit) {
    this.length = length;
    this.unit = unit;
  }

  @Override
  public String toString() {
    return String.valueOf(length) + unit.getShortcut();
  }

  public enum Units {
    METERS("m"), MILLIMETERS("mm"), CENTIMETERS("cm");

    private String shortcut;

    Units(String shortcut) {
      this.shortcut = shortcut;
    }

    private String getShortcut() {
      return shortcut;
    }
  }

}
