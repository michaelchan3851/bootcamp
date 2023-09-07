package com.bootcamp.week9;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Calculator {

  private int weight = 2;

  public int substract(int x, int y) {
    return y - x - this.weight;
  }

  public int substract2(int x, int y) {
    return y - x ;
  }

  public int multiply(int x, int y){
    return y * x;
  }
}
