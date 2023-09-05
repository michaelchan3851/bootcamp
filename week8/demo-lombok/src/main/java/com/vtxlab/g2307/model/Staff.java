package com.vtxlab.g2307.model;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//@NoArgsConstructor explicit
@EqualsAndHashCode //(of = {"name", "salary"})//override step1
// @AllArgsConstructor // default no parent
public class Staff extends Human {
  private double salary;


  // You have to manually code the constructor with Parent's attributes
  public Staff(String name, double salary) {
    super(name);
    this.salary = salary;
  }

  // @Override
  // public boolean equals(Object o) {
  //     if (this == o)
  //         return true;
  //     if (!(o instanceof Staff))
  //         return false;
  //     Staff staff = (Staff) o;
  //     return Objects.equals(this.getName(), staff.getName()) && this.salary == staff.salary;
  // }

  public static void main(String[] args) {
    Staff staff = new Staff("John", 3000.0);
    Staff staff2 = new Staff("Peter", 3000.0);

    System.out.println(staff.equals(staff2)); // true
  }
}
