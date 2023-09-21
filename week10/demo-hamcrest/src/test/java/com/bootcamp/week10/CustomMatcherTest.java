package com.bootcamp.week10;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static com.bootcamp.week10.UppercaseMatcher.*;

import org.junit.jupiter.api.Test;

public class CustomMatcherTest {

  @Test
  void CustomMatcherTest() {
    String str = "HELLOWORLD";
    String str2 = "HELLO world";
    String str3 = "hello world";

    assertThat(str, containUppercaseOnly());
    assertThat(str2, not(containUppercaseOnly()));
    assertThat(str3, not(containUppercaseOnly()));
  }
}
