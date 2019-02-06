package de.bitgrip.mapstruct.example;

import de.bitgrip.mapstruct.example.mapper.AirplaneMapper;
import de.bitgrip.mapstruct.example.mapper.CarMapper;
import de.bitgrip.mapstruct.example.mapper.MotorbikeMapper;
import de.bitgrip.mapstruct.example.model.source.*;
import de.bitgrip.mapstruct.example.model.dest.AirplaneDTO;
import de.bitgrip.mapstruct.example.model.dest.CarDTO;
import de.bitgrip.mapstruct.example.model.dest.MotorbikeDTO;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * <p>Main application which shows some mappings with mapstruct</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
public class Application {

  public static void main(String[] args) {
    List<String> transportationObject = new ArrayList<>();
    transportationObject.add("Egon");
    Car car = Car.builder().height(new Length(10, Length.Units.METERS))
            .id(UUID.randomUUID().toString())
            .length(new Length(4, Length.Units.CENTIMETERS))
            .mainBreak(Break.builder().body("my break").plate("good plate").build())
            .roof("Great roof")
            .weight(100)
            .width(new Length(10, Length.Units.MILLIMETERS))
            .transportationObjects(transportationObject).build();

    System.out.println("Car: " + car.toString());
    CarDTO carDTO = Mappers.getMapper(CarMapper.class).mapCar(car);
    System.out.println("CarDTO " + carDTO.toString());

    /*
    Log output:

    Car: Car(super=Vehicle(super=TransportationObject(id=e6569917-2460-4e74-82b8-96df7415796b,
    transportationObjects=[Egon], weight=100, width=10mm, height=10m, length=4cm), mainBreak=Break(plate=good plate,
    body=my break)), roof=Great roof)
    CarDTO CarDTO(super=VehicleDTO(super=TransportationObjectDTO(super=de.bitgrip.mapstruct.example.model.target
    .CarDTO@95d58ee2, id=e6569917-2460-4e74-82b8-96df7415796b, transportationObjects=[Egon], weight=100, width=10mm,
    height=10m, length=4cm), breakPlate=good plate, breakBody=my break), roof=Great roof)

    */
    System.out.println();

    List<String> transportationObjectMotorbike = new ArrayList<>();
    transportationObjectMotorbike.add("Ina");
    Motorbike motorbike = Motorbike.builder().height(new Length(10, Length.Units.METERS))
            .id(UUID.randomUUID().toString())
            .length(new Length(2, Length.Units.CENTIMETERS))
            .mainBreak(Break.builder().body("my motorbike break").plate("bad plate").build())
            .weight(50)
            .width(new Length(8, Length.Units.MILLIMETERS))
            .transportationObjects(transportationObjectMotorbike).build();

    System.out.println("Motorbike: " + motorbike.toString());
    MotorbikeDTO motorbikeDTO = Mappers.getMapper(MotorbikeMapper.class).map(motorbike);
    System.out.println("MotorbikeDTO " + motorbikeDTO.toString());

    /*
    Log output:

    Motorbike: Motorbike(super=Vehicle(super=TransportationObject(id=3cc503c2-3d8c-4892-a4ae-cb8c2c2e947e,
    transportationObjects=[Ina], weight=50, width=8mm, height=10m, length=2cm), mainBreak=Break(plate=bad plate,
    body=my motorbike break)), wheels=2)
    MotorbikeDTO MotorbikeDTO(super=VehicleDTO(super=TransportationObjectDTO(super=de.bitgrip.mapstruct.example.model
    .target.MotorbikeDTO@3d, id=3cc503c2-3d8c-4892-a4ae-cb8c2c2e947e, transportationObjects=[Ina], weight=50,
    width=8mm, height=10m, length=2cm), breakPlate=bad plate, breakBody=my motorbike break), wheels=2)

    */

    System.out.println();

    List<String> transportationObjectAirplane = new ArrayList<>();
    transportationObjectAirplane.add("Marcel");
    transportationObjectAirplane.add("Elena");
    Airplane airplane = Airplane.builder().height(new Length(10, Length.Units.METERS))
            .id(UUID.randomUUID().toString())
            .length(new Length(2, Length.Units.CENTIMETERS))
            .mainBreak(Break.builder().body("my airplane break").plate("very good plate").build())
            .weight(50)
            .width(new Length(8, Length.Units.MILLIMETERS))
            .maxAltitude(new Length(10000, Length.Units.METERS))
            .wings("Brightwing")
            .transportationObjects(transportationObjectAirplane).build();

    System.out.println("Airplane: " + airplane.toString());
    AirplaneDTO airplaneDTO = Mappers.getMapper(AirplaneMapper.class).mapAirplane(airplane);
    System.out.println("AirplaneDTO " + airplaneDTO.toString());

    /*
    Log output:

    Airplane: Airplane(super=FlyingVehicle(super=Vehicle(super=TransportationObject
    (id=4d664f6e-de81-4383-9a6f-668f089d07f8, transportationObjects=[Marcel, Elena], weight=50, width=8mm,
    height=10m, length=2cm), mainBreak=Break(plate=very good plate, body=my airplane break)), maxAltitude=10000m),
    wings=Brightwing)
    AirplaneDTO Airplane(super=FlyingVehicle(super=Vehicle(super=TransportationObject
    (id=4d664f6e-de81-4383-9a6f-668f089d07f8, transportationObjects=[Marcel, Elena], weight=50, width=8mm,
    height=10m, length=2cm), mainBreak=Break(plate=very good plate, body=my airplane break)), maxAltitude=10000m),
    wings=Brightwing)

    */
  }
}
