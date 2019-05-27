package com.coding.dojo.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBussTest {

  @ParameterizedTest(name = "should return {1} when given {0}")
  @CsvSource({"1,1", "3,Fizz"})
  public void should_return_correct_answer(Integer number, String answer) {
    assertEquals(answer, new FizzBuzz().say(number));
  }
}
