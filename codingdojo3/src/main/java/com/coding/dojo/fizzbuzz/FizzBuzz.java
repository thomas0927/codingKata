package com.coding.dojo.fizzbuzz;

import java.util.Arrays;

public class FizzBuzz {
  public String say(Integer number) {
    String[] results = getRulesResult(number);
    return getComponentRuleResult(number, results);
  }

  private String getComponentRuleResult(Integer number, String[] results) {
    return Arrays.stream(results)
        .filter(v -> !v.isEmpty())
        .reduce(String::concat)
        .orElse(String.valueOf(number));
  }

  private String[] getRulesResult(Integer number) {

    return new String[] {getFizzRuleResult(number), getBuzzRuleResult(number)};
  }

  private String getFizzRuleResult(Integer number) {
    return (number % 3 == 0 || isContains(number, "3")) ? "Fizz" : "";
  }

  private String getBuzzRuleResult(Integer number) {
    return (number % 5 == 0 || isContains(number, "5")) ? "Buzz" : "";
  }

  private boolean isContains(Integer number, String s) {
    return String.valueOf(number).contains(s);
  }
}
