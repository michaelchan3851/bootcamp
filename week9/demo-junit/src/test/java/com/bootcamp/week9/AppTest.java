package com.bootcamp.week9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//@TestInstance(TestInstance.Lifecycle.CLASS) 
//@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default //create new object in everytime
class AppTest {
  private int x; // instance variable

  @Test
  void testAssertEqual() {
    // Assertions.assertEquals(expected value, actual value);
    assertEquals(5, App.add(2, 3));
    assertEquals(-5, App.add(-2, -3));
    assertEquals(1, App.add(-2, 3));
    assertEquals(1, App.add(3, -2));
    assertEquals(-1, App.add(-3, 2));
    assertEquals(-1, App.add(2, -3));
    assertEquals(5, App.add(2, 3));
    assertEquals(7, App.add(2, 5)); // new add
    // Assertions.assertEquals(7, App.add(2, 5)); // false
    x++;
    assertEquals(1, x);
  }

  @Test
  void testAssertNotEqual() {
    assertNotEquals(4, App.add(1, 2));
    x++;
    //assertNotEquals(1, x);
  }

  @Test
  void testAssertTrue(){
    assertTrue(12 == App.add(7, 5));
  }

  @Test
  void testAssertFalse(){
    assertFalse(13 == App.add(7, 5));
  }

  @Test
  void testAssertNull(){
    String str = null;
    assertNull(str);
  }

  @Test
  void testAssertNotNull(){
    Student student = new Student();
    assertNotNull(student.getSubjects());
  }


  public static void main(String[] args) {
    AppTest t1 = new AppTest();
    t1.testAssertEqual();
    AppTest t2 = new AppTest();
    t2.testAssertNotEqual();

  }
}
