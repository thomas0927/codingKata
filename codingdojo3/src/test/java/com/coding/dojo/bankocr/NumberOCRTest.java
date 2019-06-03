package com.coding.dojo.bankocr;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class NumberOCRTest {

  @Test
  public void should_parse_0_from_4_3_zero_text() {
    List<String[]> ocrInfo =
        Arrays.asList(
            new String[][] {
              {" _ ", "| |", "|_|", "   "},
              {" _ ", "| |", "|_|", "   "},
            });
    Assert.assertEquals(NumberOCR.ocrNumber(ocrInfo).toString(), "00");
  }

  @Test
  public void should_parse_01_from_4_6_zero_and_one_text() {
    List<String[]> ocrInfo =
        Arrays.asList(
            new String[][] {
              {" _ ", "| |", "|_|", "   "},
              {"   ", "  |", "  |", "   "},
            });
    Assert.assertEquals(NumberOCR.ocrNumber(ocrInfo).toString(), "01");
  }

  @Test
  public void should_parse_0123456789_from_4_30_zero_to_nine_text() {
    List<String[]> ocrInfo =
        Arrays.asList(
            new String[][] {
              {" _ ", "| |", "|_|", "   "},
              {"   ", "  |", "  |", "   "},
              {" _ ", " _|", "|_ ", "   "},
              {" _ ", " _|", " _|", "   "},
              {"   ", "|_|", "  |", "   "},
              {" _ ", "|  ", " _|", "   "},
              {" _ ", "|_ ", "|_|", "   "},
              {" _ ", "  |", "  |", "   "},
              {" _ ", "|_|", "|_|", "   "},
              {"   ", "|_|", " _|", "   "},
            });
    Assert.assertEquals(NumberOCR.ocrNumber(ocrInfo).toString(), "0123456789");
  }
}
