package com.coding.dojo.bankocr;

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

  @Override
  public String toString() {
    return numberList.stream().map(INumber::print).collect(Collectors.joining(""));
  }

  public String[] split(String s, int i) {
    return new String[] {" _ ", "   ", " _ "};
  }
}
