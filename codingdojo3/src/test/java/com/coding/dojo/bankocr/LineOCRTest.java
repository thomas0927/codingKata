package com.coding.dojo.bankocr;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class LineOCRTest {

  @Test
  public void can_read_4_line_to_number() {
    List<String> lines =
        Arrays.asList(
            "         ", "  |  |  |", "  |  |  |", "", "         ", "  |  |  |", "  |  |  |", "");
    LineOCR lineOCR = new LineOCR(lines);
    assertEquals(lineOCR.size(), 2);
  }
}
