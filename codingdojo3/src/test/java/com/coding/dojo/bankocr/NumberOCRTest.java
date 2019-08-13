package com.coding.dojo.bankocr;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class NumberOCRTest {
  @Test
  public void can_read_0_from_3_3_string() {
    String top = " _ ";
    String middle = "| |";
    String down = "|_|";
    List<String> stringList = Arrays.asList(top, middle, down);
    assertEquals(ZeroOCR.ocr(stringList).print(), "0");
  }
}
