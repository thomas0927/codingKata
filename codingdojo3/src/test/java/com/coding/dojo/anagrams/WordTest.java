package com.coding.dojo.anagrams;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WordTest {
  @Test
  public void should_return_same_hashcode_from_same_character_word() {
    Word w1 = new Word("ab");
    Word w2 = new Word("ba");
    String[] zeroText = new String[] {" _ ", "| |", "|_|"};
    System.out.println(zeroText.toString());
    System.out.println(zeroText.hashCode());
    Assert.assertTrue(w1.hashCode() == w2.hashCode());
  }
}
