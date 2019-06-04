package com.coding.dojo.wycash;

public class Dollar extends Money {

  public String currency;

  public Dollar(int amount) {
    this.amount = amount;
    this.currency = "USD";
  }

  @Override
  public Money times(int multiplier) {
    return new Dollar(this.amount * multiplier);
  }

  @Override
  public String currency() {
    return this.currency;
  }
}
