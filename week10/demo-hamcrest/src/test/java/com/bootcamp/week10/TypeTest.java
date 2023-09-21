package com.bootcamp.week10;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class TypeTest {

  @Test
  void testIfObjectIsInstanceOf() {
    Object object = "Hello world";
    assertThat(object, instanceOf(String.class));
    assertThat(object, not(instanceOf(Integer.class)));
  }

  void testIfClassIsCompatibleWith() { // The test between two classes is an inheritance relationship.
    assertThat(Integer.class, is(typeCompatibleWith(Number.class)));
    assertThat(Integer.class, is(typeCompatibleWith(Object.class)));
    assertThat(Number.class, is(not(typeCompatibleWith(Integer.class))));

  }

}
