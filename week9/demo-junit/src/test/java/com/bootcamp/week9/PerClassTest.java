package com.bootcamp.week9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // default
@TestMethodOrder(OrderAnnotation.class)
public class PerClassTest {
  private int x;

  @Test
  @Order(2) // order by us to decide step 2
  void test1() {
    this.x++;
    System.out.println(this.x);
    assertEquals(2, this.x);
  }

  @Test
  @Order(1) // order by us to decide step 1
  void test2() {
    this.x++;
    System.out.println(this.x);
    assertEquals(1, this.x);

  }
}
