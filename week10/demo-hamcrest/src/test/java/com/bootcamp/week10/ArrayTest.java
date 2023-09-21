package com.bootcamp.week10;

import static org.hamcrest.Matchers.*;

import static org.hamcrest.MatcherAssert.*;
import org.junit.jupiter.api.Test;

public class ArrayTest {

  @Test
  void testArray() {
    String[] strings = new String[] { "apple", "cherry", "banana" };
    assertThat(strings, arrayContaining("apple", "cherry", "banana")); // size && ordering
    assertThat(strings, not(arrayContaining("banana", "cherry", "apple")));
    assertThat(strings, not(arrayContaining("banana", "apple")));

    assertThat(strings, arrayContainingInAnyOrder("apple", "cherry", "banana")); // size
    assertThat(strings, not(arrayContainingInAnyOrder("banana", "apple")));

  }
}
