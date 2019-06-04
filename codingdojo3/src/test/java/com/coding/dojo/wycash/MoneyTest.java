package com.coding.dojo.wycash;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MoneyTest {
  @Test
  public void testMultiplication() {
    Money five = Money.dollar(5);
    assertEquals(Money.dollar(10), five.times(2));
    assertEquals(Money.dollar(15), five.times(3));
  }

  @Test
  public void testEquality() {
    assertEquals(Money.dollar(5), Money.dollar(5));
    assertNotEquals(Money.dollar(5), Money.dollar(6));
    assertEquals(Money.franc(5), Money.franc(5));
    assertNotEquals(Money.franc(5), Money.franc(6));
    assertNotEquals(Money.franc(5), Money.dollar(5));
  }

  @Test
  public void testDifferentClassEquality() {
    assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
  }

  @Test
  public void testSimpleAddition() {
    Money sum = Money.dollar(5).plus(Money.dollar(5));
    assertEquals(Money.dollar(10), sum);
  }

  @Test
  public void testCurrency() {
    assertEquals("USD", Money.dollar(1).currency());
  }
}
