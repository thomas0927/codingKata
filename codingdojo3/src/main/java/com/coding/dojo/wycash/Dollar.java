package com.coding.dojo.wycash;

public class Dollar extends Money {

  public Dollar(int amount) {
    this.amount = amount;
  }

  Money times(int multiplier) {
    return new Dollar(this.amount * multiplier);
  }
}
