package com.coding.dojo.wycash;

public class Money {
  protected int amount;

  public static Dollar dollar(int amount) {
    return new Dollar(amount);
  }

  @Override
  public boolean equals(Object obj) {
    Money money = (Money) obj;
    return amount == money.amount && getClass().equals(money.getClass());
  }
}
