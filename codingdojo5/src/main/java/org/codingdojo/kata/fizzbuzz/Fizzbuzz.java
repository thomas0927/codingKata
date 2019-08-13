/**
 * FileName: Fizzbuzz
 * Author: admin
 * Date: 2019/8/12 17:01
 */
package org.codingdojo.kata.fizzbuzz;

import static java.lang.String.valueOf;

public class Fizzbuzz {
    public static String say(int input) {
        if (isRelate(input,3) && isRelate(input,5)) return "fizzbuzz";
        if (isRelate(input, 3)) return "fizz";
        if (isRelate(input, 5)) return "buzz";
        return valueOf(input);
    }

    private static boolean isRelate(int input, int i) {
        return input % i == 0|| valueOf(input).contains(valueOf(i));
    }
}
