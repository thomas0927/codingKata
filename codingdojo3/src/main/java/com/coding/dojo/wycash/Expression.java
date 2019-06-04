package com.coding.dojo.wycash;

public interface Expression {
  Money reduce(Bank bank, String to);
}
