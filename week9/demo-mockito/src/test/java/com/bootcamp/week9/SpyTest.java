package com.bootcamp.week9;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SpyTest {

  @Spy
  Calculator calculator; // have implementation

  @InjectMocks
  Checkout checkout;

  @Test
  void testAdd(){
    when(checkout.add(3, 4)).thenReturn(100);
    int result = checkout.add(3, 4); // 4 + ( 4 - 3 - 2)
    assertEquals(104, result); 
    verify(calculator,times(1)).substract(3,4);
  }

  @Test
  void testAdd2() {
    int result = checkout.add(3, 4);
    assertEquals(3, result); // 4 + ( 4 - 3 - 2)
  }

  @Test
  void test3(){
    when(calculator.multiply(-2, 4)).thenReturn(100); //override
    int result = checkout.multiply(-2, 4); 
    assertEquals(104, result); // checkout.multiply=100 + calculator.substract=(4-(-2)-2)
    // this.calculator.substract = constant value;
  }
}
