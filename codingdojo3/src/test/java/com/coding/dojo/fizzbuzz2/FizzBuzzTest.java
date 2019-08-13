/** FileName: FizzBuzzTest Author: admin Date: 2019/7/15 9:44 */
package com.coding.dojo.fizzbuzz2;

import com.coding.dojo.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class FizzBuzzTest {
  @Test
  void should_print_fizz_buzz_list_corretly() {
    assertEquals(100, splitOutput().length);
    assertEquals("1", getOutputLine(1));
    assertEquals("Fizz", getOutputLine(3));
    assertEquals("Buzz", getOutputLine(5));
    assertEquals("FizzBuzz", getOutputLine(15));
    assertEquals("Fizz", getOutputLine(13));
    assertEquals("Buzz", getOutputLine(52));
    assertEquals("FizzBuzz", getOutputLine(53));
  }

  private String getOutputLine(int i) {
    return splitOutput()[i - 1];
  }

  private String[] splitOutput() {
    return new FizzBuzz().print().split("\n");
  }
}
