package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArgsTest {
  @Test
  public void should_return_correct_value() {
    Assert.assertEquals(new Args("-l", "l:&").getValue('l'), Boolean.TRUE);
  }
}
