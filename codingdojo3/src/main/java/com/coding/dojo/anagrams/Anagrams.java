package com.coding.dojo.anagrams;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Anagrams {
  private List<Anagram> anagrams;

  public Anagrams(List<Word> words) {
    guessWords(words);
  }

  public Anagrams(String fileName) throws IOException {
    guessAnagramFromFile(fileName);
  }

  public String longestWord() {
    return this.anagrams.stream().max(Comparator.comparing(Anagram::length)).get().toString();
  }

  public String mostWords() {
    return this.anagrams.stream().max(Comparator.comparing(Anagram::count)).get().toString();
  }

  private void guessWords(List<Word> words) {
    this.anagrams =
        words.stream()
            .collect(Collectors.groupingBy(Word::hashCode))
            .values()
            .stream()
            .map(Anagram::new)
            .collect(Collectors.toList());
  }

  private void guessAnagramFromFile(String fileName) throws IOException {
    guessWords(getWordsFromFile(fileName));
  }

  private List<Word> getWordsFromFile(String fileName) throws IOException {
    return getWords(getPath(fileName));
  }

  private Path getPath(String fileName) {
    return Paths.get(URI.create(this.getClass().getResource(fileName).toString()));
  }

  private List<Word> getWords(Path paths) throws IOException {
    return Files.newBufferedReader(paths).lines().map(Word::new).collect(Collectors.toList());
  }
}
