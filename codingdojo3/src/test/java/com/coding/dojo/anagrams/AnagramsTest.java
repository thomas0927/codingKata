package com.coding.dojo.anagrams;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;

public class AnagramsTest {
  @Test
  public void should_find_longest_anagram_from_words() {
    Anagrams anagrams =
        new Anagrams(Arrays.asList(new Word("abc"), new Word("ab"), new Word("ba")));
    Assert.assertEquals(anagrams.longestWord(), "abc");
  }

  @Test
  public void should_find_mostWords_anagram_from_words() {
    Anagrams anagrams =
        new Anagrams(Arrays.asList(new Word("abc"), new Word("ab"), new Word("ba")));
    Assert.assertEquals(anagrams.mostWords(), "ab ba");
  }

  @Test
  public void should_find_longest_word_from_file() throws IOException {
    Anagrams anagrams = new Anagrams("/wordlist-mini.txt");
    Assert.assertEquals(anagrams.longestWord(), "ACTH's");
  }

  @Test
  public void should_find_most_words_from_file() throws IOException {
    Anagrams anagrams = new Anagrams("/wordlist-mini.txt");
    Assert.assertEquals(anagrams.mostWords(), "AA's s'AA As'A");
  }

  @Test
  public void get_game_result() throws IOException {
    Anagrams anagrams = new Anagrams("/wordlist.txt");
    System.out.println(anagrams.longestWord());
    System.out.println(anagrams.mostWords());
  }
}
