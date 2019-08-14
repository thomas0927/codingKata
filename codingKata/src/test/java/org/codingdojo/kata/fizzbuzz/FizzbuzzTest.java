/**
 * FileName: FizzbuzzTest
 * Author: admin
 * Date: 2019/8/14 10:47
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
            "2,'2'",
            "3,'fizz'",
            "5,'buzz'",
            "15,'fizzbuzz'",
            "53,'fizzbuzz'",
            "51,'fizzbuzz'",
            "13,'fizz'",
            "52,'buzz'",
    })
    void should_return_fizzbuzz_number(int input,String answer){
        assertEquals(Fizzbuzz.say(input),answer);
    }
}
