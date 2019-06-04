package com.coding.dojo.wycash;

public class Money {
  int amount;
  String currency;

  Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }

  @Override
  public boolean equals(Object obj) {
    Money money = (Money) obj;
    return amount == money.amount && currency().equals(money.currency());
  }

  public Money times(int multiplier) {
    return null;
  }

  String currency() {
    return currency;
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }
}
