package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SchemasTest {
  @Test
  public void should_get_schema_value_by_input() {
    Assert.assertEquals(new Schemas("l:&").getArgsValue('l', ""), Boolean.TRUE);
  }
}
