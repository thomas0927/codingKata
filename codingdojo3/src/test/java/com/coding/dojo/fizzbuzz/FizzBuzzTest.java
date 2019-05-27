package com.coding.dojo.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
  @ParameterizedTest(name = "should return {1} when give{0}")
  @CsvSource({"1,1", "3,Fizz", "5,Buzz", "15,FizzBuzz", "13,Fizz"})
  public void should_return_correct_answer(Integer number, String answer) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals(answer, fizzBuzz.say(number));
  }
}
