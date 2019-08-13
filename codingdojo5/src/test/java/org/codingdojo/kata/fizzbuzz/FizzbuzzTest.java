/**
 * FileName: FizzbuzzTest
 * Author: admin
 * Date: 2019/8/12 17:00
 */
package org.codingdojo.kata.fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
    @ParameterizedTest(name="{index}=>{arguments}")
    @DisplayName("should return fizzbuzz number")
    @CsvSource({
            "1,'1'",
            "3,'fizz'",
            "5,'buzz'",
            "15,'fizzbuzz'",
            "13,'fizz'",
            "53,'fizzbuzz'"
    })
    void should_return_fizzbuzz_number(int input,String expected){
        assertEquals(Fizzbuzz.say(input),expected);
    }
}
