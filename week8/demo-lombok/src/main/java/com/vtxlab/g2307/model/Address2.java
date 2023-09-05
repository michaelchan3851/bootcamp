package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

//@AllArgsConstructor
//@RequiredArgsConstructor
@Builder
public class Address2 extends Place {
  private String addr;

  @Builder
  public Address2(String name, String addr) {
      super(name);
      this.addr = addr;
  }
  
  public static void main(String[] args) {
  
    //Address a3 = new Address(null); // error
    Address2 a1 = Address2.builder()
        .addr("abc")
        .name("def")
        .build();

        System.out.println(a1.name);
  }
}
