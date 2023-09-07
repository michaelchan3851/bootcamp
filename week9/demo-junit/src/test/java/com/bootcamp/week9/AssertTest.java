package com.bootcamp.week9;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//@TestInstance(TestInstance.Lifecycle.CLASS) 
@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default //create new object in everytime
@DisplayName("Assert Method Tests")
class AssertTest {
  private int x; // instance variable

  @Test
  @DisplayName("AssertEquals Test")
  void testAssertEqual() {
    // Assertions.assertEquals(expected value, actual value);
    assertEquals(5, App.add(2, 3));
    // Assertions.assertEquals(7, App.add(2, 5)); // false
    x++;
    assertEquals(1, x);
  }

  @Test
  @DisplayName("AssertNotEquals Test")
  void testAssertNotEqual() {
    assertNotEquals(4, App.add(1, 2));
    x++;
    // assertNotEquals(1, x);
  }

  @Test
  void testAssertTrue() {
    assertTrue(12 == App.add(7, 5));
  }

  @Test
  void testAssertFalse() {
    assertFalse(13 == App.add(7, 5));
  }

  @Test
  void testAssertNull() {
    String str = null;
    assertNull(str);
  }

  @Test
  void testAssertNotNull() {
    Student student = new Student();
    assertNotNull(student.getSubjects());
  }

  @Test
  void testAssertThrows() {
    assertThrows(ArithmeticException.class, () -> {
      App.divide(10, 0);
    });

    assertDoesNotThrow(() -> {
      App.divide(10, 1);

    });
  }

  @Test
  void testAssertTimeout() {
    assertTimeout(Duration.ofMillis(100), () -> {
      Thread.sleep(50); // ms
    });
  }

  @Test
  void testCombine() {
    assertAll(
        () -> assertTrue(10 > 3),
        () -> assertEquals(10, App.add(4, 6)),
        () -> assertNull(null));
  }

  @Test
  void testSame() {
    String s1 = new String("Junit");
    String s2 = new String("Junit");
    assertNotSame(s1, s2); // test object reference is it same ?

    String s3 = "Junit";
    String s4 = "Junit";
    assertSame(s3, s4); // test object reference instead of values
    assertEquals(s3, s4); // check values
  }

  public static void main(String[] args) {
    AssertTest t1 = new AssertTest();
    t1.testAssertEqual();
    AssertTest t2 = new AssertTest();
    t2.testAssertNotEqual();

  }
}
