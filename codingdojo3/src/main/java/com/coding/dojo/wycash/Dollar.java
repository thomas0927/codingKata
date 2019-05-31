package com.coding.dojo.wycash;

public class Dollar {
  public int amount;

  public Dollar(int amount) {
    this.amount = amount;
  }

  public void times(int multiplier) {
    this.amount *= multiplier;
  }
}
