package com.bootcamp.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

public class CollectionTest {

  @Test
  void testList() {
    List<String> strings = Arrays.asList("apple", "banana", "cherry");
    assertThat(strings, hasItem("cherry"));
    assertThat(strings, hasItems("cherry", "apple"));
    assertThat(strings, hasSize(3));
    // number of items + ordering
    assertThat(strings, contains("apple", "banana", "cherry"));
    assertThat(strings, not(contains("apple", "cherry")));
    assertThat(strings, not(contains("apple", "cherry", "banana")));
    // number of items + ignore ordering
    assertThat(strings, containsInAnyOrder("apple", "cherry", "banana"));
    assertThat(strings, not(containsInAnyOrder("apple", "banana")));

    List<String> emptyList = new ArrayList<>();
    assertThat(emptyList, empty()); // or emptyList.size() == 0

  }
}
