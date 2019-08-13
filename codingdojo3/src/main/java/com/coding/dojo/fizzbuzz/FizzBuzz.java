package com.coding.dojo.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
  public String say(int i) {
    return Rules.all().stream()
        .map(rule -> rule.exec(i))
        .reduce(String::concat)
        .filter(s -> !s.isEmpty())
        .orElse(String.valueOf(i));
  }

  public String print(int i) {

    return IntStream.range(1, i + 1).mapToObj(this::say).collect(Collectors.joining(","));
  }

  public String print() {
    return IntStream.rangeClosed(1, 100).mapToObj(this::tag).collect(Collectors.joining("\n"));
  }

  private String tag(int turn) {

    if (isFizz(turn) && isBuzz(turn)) {
      return "FizzBuzz";
    }
    if (isFizz(turn)) {
      return "Fizz";
    }
    if (isBuzz(turn)) {
      return "Buzz";
    }
    return String.valueOf(turn);
  }

  private boolean isBuzz(int turn) {
    return contains(turn, 5) || isDividableBy(turn, 5);
  }

  private boolean isFizz(int turn) {
    return contains(turn, 3) || isDividableBy(turn, 3);
  }

  private boolean contains(int turn, int i) {
    return turn / 10 == i || turn % 10 == i;
  }

  private boolean isDividableBy(int turn, int i) {
    return turn % i == 0;
  }
}
