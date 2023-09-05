package com.vtxlab.g2307.model;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

//@NoArgsConstructor explicit
// @AllArgsConstructor // default no parent
@EqualsAndHashCode (callSuper = true)
@SuperBuilder
public class Staff2 extends Human {
  private double salary;


  // You have to manually code the constructor with Parent's attributes
  public Staff2(String name, double salary) {
    super(name);
    this.salary = salary;
  }

  // @Override
  // public boolean equals(Object o){
  //   if(this == o)
  //   return true;
  //   if(! (o instanceof Staff))
  //     return false;
  //     Staff staff = (Staff) o;
  //     return Objects.equals(spuer(name) , this.salary);
  // }

  public static void main(String[] args) {
    Staff2 staff = new Staff2("John", 3000.0);
    Staff2 staff2 = new Staff2("Peter", 3000.0);

    System.out.println(staff.equals(staff2)); // false

    Staff2 s4 = Staff2.builder()
      .name("Mary")
      .salary(20000)
      .build();
  }
}
