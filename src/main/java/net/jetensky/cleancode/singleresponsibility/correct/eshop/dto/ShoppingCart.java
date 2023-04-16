package net.jetensky.cleancode.singleresponsibility.correct.eshop.dto;

import java.math.BigDecimal;
import java.util.Map;

public class ShoppingCart {
  Map<String, ShoppingCartItem> cartContent;

  public void sumCart() {
    BigDecimal result = new BigDecimal(0);
    for (ShoppingCartItem item : cartContent.values()) {
      result = result.add(item.getPrice());
      System.out.println("Adding " + item.getPrice());
      System.out.println("A");
      System.out.println("B");
      System.out.println("C");
      System.out.println("D");
    }
    System.out.println("Done");
  }

  public void sum() {
    BigDecimal result = new BigDecimal(0);
    for (ShoppingCartItem item : cartContent.values()) {
      result = result.add(item.getPrice());
      System.out.println("Adding " + item.getPrice());
      System.out.println("A");
      System.out.println("B");
      System.out.println("C");
      System.out.println("D");
    }
    System.out.println("Done");
  }
}
