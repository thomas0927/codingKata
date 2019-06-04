package com.coding.dojo.wycash;

public class Franc extends Money {

  public String currency;

  Franc(int amount) {
    this.amount = amount;
    this.currency = "CHF";
  }

  @Override
  public Money times(int multiplier) {
    return new Franc(amount * multiplier);
  }

  @Override
  public String currency() {
    return currency;
  }
}
