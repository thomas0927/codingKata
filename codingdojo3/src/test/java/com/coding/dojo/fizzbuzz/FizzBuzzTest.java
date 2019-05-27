package com.coding.dojo.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
  @ParameterizedTest(name = "should return {1} given {0}")
  @CsvSource({
    "1,1",
    "3,Fizz",
    "13,Fizz",
    "5,Buzz",
    "52,Buzz",
    "15,FizzBuzz",
    "31,Fizz",
    "53,FizzBuzz"
  })
  public void should_answer_correct_fizz_buzz_number(Integer number, String answer) {
    assertEquals(getSay(number), answer);
  }

  @Test
  public void should_return_correct_list() {
    assertEquals(100, new FizzBuzz().print(100).split("\n").length);
  }

  private String getSay(Integer number) {
    return new FizzBuzz().say(number);
  }
}
