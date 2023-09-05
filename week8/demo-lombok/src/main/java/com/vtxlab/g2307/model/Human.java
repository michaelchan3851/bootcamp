package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor //abract class can't new object
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@SuperBuilder
public class Human {
  private  String name;

  
}
