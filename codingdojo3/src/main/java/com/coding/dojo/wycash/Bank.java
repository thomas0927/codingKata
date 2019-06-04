package com.coding.dojo.wycash;

public class Bank {
  public Money reduce(Expression source, String to) {
    return source.reduce(to);
  }

  public void addRate(String from, String to, int rate) {}
}
