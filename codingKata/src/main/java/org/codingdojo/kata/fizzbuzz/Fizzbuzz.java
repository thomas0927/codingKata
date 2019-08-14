/** FileName: Fizzbuzz Author: admin Date: 2019/8/14 10:57 */
package org.codingdojo.kata.fizzbuzz;

import static java.lang.String.valueOf;

public class Fizzbuzz {
  public static String say(int input) {
      if (isRelateWith(input, 3) && isRelateWith(input, 5))return "fizzbuzz";
    if (isRelateWith(input, 3)) return "fizz";
    if (isRelateWith(input, 5)) return "buzz";
    return valueOf(input);
  }

    private static boolean isRelateWith(int input, int i) {
        return input % i == 0 || valueOf(input).contains(valueOf(i));
    }
}
