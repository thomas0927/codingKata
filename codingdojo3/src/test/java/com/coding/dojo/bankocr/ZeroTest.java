package com.coding.dojo.bankocr;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class ZeroTest {

  @Test
  public void should_parse_0_from_4_3_zero_text() {
    List<String[]> ocrInfo = Arrays.asList(new String[][] {{" _ ", "| |", "|_|", "   "}});
    Assert.assertEquals(NumberOCR.ocrNumber(ocrInfo).toString(), "0");
  }
}
