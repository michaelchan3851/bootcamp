package com.bootcamp.week9;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // default
public class BeforeAllAfterAllTest {
  private int x;

  @BeforeAll
  void BeforeAll() {
    System.out.println("beforeAll start, x=" + this.x);
  }

  @AfterAll
  void AfterAll() {
    System.out.println("afterAll start, x=" + this.x);
  }

  @Test
  void test() { // instance method
    System.out.println("test x=" + this.x);
    x++;
    assertTrue(x == 1);
  }

  @Test
  void test2() {
    System.out.println("test x=" + this.x);
    x++;
    assertTrue(x == 2);
  }
}
