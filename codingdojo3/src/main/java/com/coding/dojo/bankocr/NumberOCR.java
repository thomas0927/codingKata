package com.coding.dojo.bankocr;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOCR {
  private static Map<Integer, ZeroOCR> convertes = new HashMap<>();

  static {
  }

  public static NumberOCR ocrNumber(List<String[]> ocrInfo) {
    return new NumberOCR();
  }

  @Override
  public String toString() {
    return "0";
  }
}
