package com.coding.dojo.bankocr;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class ZeroTest {

  @Test
  public void should_parse_0_from_4_3_zero_text() {
    String[] zeroText = new String[] {" _ ", "| |", "|_|"};
    Assert.assertEquals(NumberOCR.parser(zeroText).toString(), "0");
  }
}
