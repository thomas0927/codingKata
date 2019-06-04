package com.coding.dojo.wycash;

public abstract class Money {
  protected int amount;

  public static Money dollar(int amount) {
    return new Dollar(amount);
  }

  public static Money franc(int amount) {
    return new Franc(amount);
  }

  @Override
  public boolean equals(Object obj) {
    Money money = (Money) obj;
    return amount == money.amount && getClass().equals(money.getClass());
  }

  public abstract Money times(int multiplier);
}
