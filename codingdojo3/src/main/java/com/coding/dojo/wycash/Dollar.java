package com.coding.dojo.wycash;

public class Dollar extends Money {

  Dollar(int amount, String currency) {
    super(amount, currency);
  }

  @Override
  public Money times(int multiplier) {
    return Money.dollar(this.amount * multiplier);
  }
}
