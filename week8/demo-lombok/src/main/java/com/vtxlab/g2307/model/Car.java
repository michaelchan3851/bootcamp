package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//@AllArgsConstructor // included all attribute constructor
// @NoArgsConstructor //empty constructor
@RequiredArgsConstructor //
public class Car {

  @NonNull 
  private Integer capacity;
  private final double weight;
  private String color;

  public Car(String color) {
    this.color = color;
    this.weight = 0;
  }

  public static void main(String[] args) {
    Car car = new Car(5, 10.0);
  }

}
