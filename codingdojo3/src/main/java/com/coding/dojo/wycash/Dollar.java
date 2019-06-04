package com.coding.dojo.wycash;

public class Dollar {
  private int amount;

  public Dollar(int amount) {
    this.amount = amount;
  }

  public Dollar times(int multiplier) {
    return new Dollar(this.amount * multiplier);
  }

  @Override
  public boolean equals(Object obj) {
    Dollar dollar = (Dollar) obj;
    return amount == dollar.amount;
  }
}
