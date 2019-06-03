package com.coding.dojo.bankocr;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOCR {
  private static Map<String, INumber> converters = new HashMap<>();

  static {
    converters.put(" _ | ||_|   ", new Zero());
    converters.put("     |  |   ", new One());
    converters.put(" _  _||_    ", new Two());
    converters.put(" _  _| _|   ", new Three());
    converters.put("   |_|  |   ", new Four());
    converters.put(" _ |   _|   ", new Five());
    converters.put(" _ |_ |_|   ", new Six());
    converters.put(" _   |  |   ", new Seven());
    converters.put(" _ |_||_|   ", new Eight());
    converters.put("   |_| _|   ", new Nine());
  }

  private List<INumber> numberList;

  public NumberOCR(List<String[]> ocrInfo) {
    this.numberList =
        ocrInfo.stream()
            .map(s -> String.join("", s))
            .map(l -> converters.get(l))
            .collect(Collectors.toList());
  }

  public NumberOCR() {}

  public static NumberOCR ocrNumber(List<String[]> ocrInfo) {
    return new NumberOCR(ocrInfo);
  }

  public static NumberOCR ocrNumber(String fileName) throws IOException {
    Path path = getPath(fileName);
    List<String> lines = Files.newBufferedReader(path).lines().collect(Collectors.toList());
    List<String[]> ocrInfo = new ArrayList<>();
    for (int i = 0; i < lines.size(); i += 4) {
      List<String> line0 = split(lines.get(i), 3);
      List<String> line1 = split(lines.get(i + 1), 3);
      List<String> line2 = split(lines.get(i + 2), 3);
      List<String> line3 = split(lines.get(i + 3), 3);
      for (int j = 0; j < line0.size(); j++) {
        ocrInfo.add(new String[] {line0.get(j), line1.get(j), line2.get(j), line3.get(j)});
      }
    }
    return new NumberOCR(ocrInfo);
  }

  private static Path getPath(String fileName) {
    return Paths.get(URI.create(NumberOCR.class.getResource(fileName).toString()));
  }

  @Override
  public String toString() {
    return numberList.stream().map(INumber::print).collect(Collectors.joining(""));
  }

  public static List<String> split(String stringLine, int length) {
    List<String> list = new ArrayList<>();
    for (int index = 0; index < stringLine.length(); index += length) {
      String childStr = subString(stringLine, index, index + length);
      list.add(childStr);
    }
    return list;
  }

  private static String subString(String str, int from, int to) {
    if (from > str.length()) {
      return "";
    }
    if (to > str.length()) {
      return str.substring(from);
    }
    return str.substring(from, to);
  }
}
