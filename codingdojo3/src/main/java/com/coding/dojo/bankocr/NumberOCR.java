package com.coding.dojo.bankocr;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOCR {
  private static Map<String, INumber> convertes = new HashMap<>();

  static {
    convertes.put(" _ | ||_|   ", new Zero());
  }

  private final List<INumber> numberList;

  public NumberOCR(List<String[]> ocrInfo) {
    this.numberList =
        ocrInfo.stream()
            .map(s -> String.join("", s))
            .map(l -> convertes.get(l))
            .collect(Collectors.toList());
  }

  public static NumberOCR ocrNumber(List<String[]> ocrInfo) {
    return new NumberOCR(ocrInfo);
  }

  @Override
  public String toString() {
    return numberList.stream().map(INumber::print).collect(Collectors.joining(""));
  }
}
