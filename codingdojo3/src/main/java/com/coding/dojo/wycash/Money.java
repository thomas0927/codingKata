package com.coding.dojo.wycash;

public class Money implements Expression {
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
    return new Money(amount * multiplier, currency);
  }

  String currency() {
    return currency;
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }

  public Expression plus(Money addend) {
    return new Sum(this, addend);
  }

  @Override
  public Money reduce(String to) {
    int rate = (currency.equals("CHF") && to.equals("USD")) ? 2 : 1;
    return new Money(amount / rate, to);
  }
}
