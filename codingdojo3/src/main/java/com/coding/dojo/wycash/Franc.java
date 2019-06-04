package com.coding.dojo.wycash;

public class Franc extends Money {

  Franc(int amount, String currency) {
    super(amount, currency);
  }

  @Override
  public Money times(int multiplier) {
    return new Franc(amount * multiplier, currency);
  }
}
