package com.coding.dojo.wycash;

public class Franc extends Money {

  Franc(int amount) {
    this.amount = amount;
  }

  @Override
  public Money times(int multiplier) {
    return new Franc(amount * multiplier);
  }
}
