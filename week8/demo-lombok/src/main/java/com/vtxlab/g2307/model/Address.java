package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
//@RequiredArgsConstructor
@Builder
public class Address  {
  private String addrLine1;
  private String addrLine2;
  private String addrLine3;
  //@NonNull
  private Country country;
  


  public Address(Country country) {
    if (country == null)
      throw new NullPointerException();
    this.country = country;

  }

  public static void main(String[] args) {
    Address a1 = new Address(Country.HK); // RequiredArgsConstructor
    //Address a3 = new Address(null); // error
    Address a2 = Address.builder()
        .addrLine1("abc")
        .addrLine2("def")
        .addrLine3("ijk")
        .country(Country.HK)
        .build();

        System.out.println(a2.addrLine1);
  }
}
