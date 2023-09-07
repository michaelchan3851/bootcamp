package com.bootcamp.week9;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class MockTest {

  @Mock
  Calculator calculator;

  @InjectMocks
  Checkout checkout;

  @Test
  void testSubstract() {
    Calculator selfNew = new Calculator(3);
    assertEquals(-7, selfNew.substract(10, 6));
    assertEquals(6, selfNew.multiply(2, 3));
  }

  @Test
  void testAdd(){
    when(calculator.substract(3,4)).thenReturn(100); 
    //Checkout checkout = new Checkout(calculator);
    // Testing Start
    int result = checkout.add(3, 4); // because 5 > 1, so 
    //return y + this.calculator.substract(x, y) = 6 + (int)(default value)=0
    assertEquals(104, result); // ans = 6, 100 + 4 = 104
    //verify(calculator, times(1)).substract(3,4);
  }

  @Test
  void testAdd2(){
    when(this.calculator.substract(1,4)).thenReturn(100); // you must go through substract method
    //Checkout checkout = new Checkout(calculator2);
    // Testing Start
    int result = checkout.add(1, 4); //Scenario x < 1
    assertEquals(5, result); //1 + 4 = 5
    verify(calculator, times(0)).substract(1,4); //because 1 is not smaller 1, so x + y 
  }

  @Test
  void testMultiply(){
    when(this.calculator.multiply(7,9)).thenReturn(10000);
    int result = checkout.multiply(7, 9);  //Scenario x > 1
    assertEquals(10009, result); // y + this.calculator.multiply(x, y) = 10000 + 9
  }

  @Test
  void testMultiply2(){
    when(this.calculator.substract(3,8)).thenReturn(10000);
    int result = checkout.multiply(3,8);  //Scenario x < 1
    assertEquals(8, result); // 8 + 0 = y + this.calculator.multiply(x, y) <= x * y = 0 * 0
  }

  @Test
  void test3(){
    when(calculator.multiply(-2, 4)).thenReturn(100);
    int result = checkout.multiply(-2, 4); //calculator.multiply=100, //calculator.substract=0
    assertEquals(100, result); // 100 + 0
  }
}
